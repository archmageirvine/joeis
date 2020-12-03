package irvine.factor.factor;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * Attempt factorization by the SQUFOF method. Ported to Java by Sean A.
 * Irvine based on a C implementation by Jason Papadopoulos. It races as
 * many multipliers as can bit into 62-bits.
 *
 * @author Jason Papadopoulos
 * @author Sean A. Irvine
 */
public class Squfof extends AbstractFactorizer {

  private static final int[] MULTIPLIERS = {
    1, 3, 5, 7, 11, 3 * 5, 3 * 7, 3 * 11, 5 * 7, 5 * 11, 7 * 11,
    3 * 5 * 7, 3 * 5 * 11, 3 * 7 * 11, 5 * 7 * 11, 3 * 5 * 7 * 11
  };

  private static final int QSIZE = 50;

  // The maximum number of inner loop iterations for all multipliers combined
  private static final int MAX_CYCLES = 100000;

  // The number of iterations to do before switching to the next multiplier
  private static final int ONE_CYCLE_ITER = 300;

  private static class SqufofData {
    long mN;
    final int[] mSqrtN = new int[MULTIPLIERS.length];
    final int[] mCutoff = new int[MULTIPLIERS.length];
    final int[] mQ0 = new int[MULTIPLIERS.length];
    final int[] mP1 = new int[MULTIPLIERS.length];
    final int[] mQ1 = new int[MULTIPLIERS.length];
    final int[] mNumSaved = new int[MULTIPLIERS.length];
    final char[][] mSaved = new char[MULTIPLIERS.length][QSIZE];
    final boolean[] mFailed = new boolean[MULTIPLIERS.length];
  }

  private final Fast mPrime = new Fast();

  private int mFactorFound;

  // Perform one unit of work for SQUFOF with one multiplier
  private int oneCycle(final SqufofData data, final int multIdx, final int numIter) {
    final int sqrtn = data.mSqrtN[multIdx];
    final int cutoff = data.mCutoff[multIdx];
    int numSaved = data.mNumSaved[multIdx];
    final int multiplier = 2 * MULTIPLIERS[multIdx];
    final int coarseCutoff = cutoff * multiplier;
    final char[] saved = data.mSaved[multIdx];
    int q0 = data.mQ0[multIdx];
    int p1 = data.mP1[multIdx];
    int q1 = data.mQ1[multIdx];

    int p0 = 0;
    int sqrtq = 0;
    int i;
    for (i = 0; i < numIter; ++i) {
      // Compute (sqrtn+p1)/q1; since this is unity more than half the time,
      // special case the division to save some effort
      final int tmp = sqrtn + p1 - q1;
      final int q = tmp >= q1 ? 1 + tmp / q1 : 1;
      // Compute the next numerator and denominator
      p0 = q * q1 - p1;
      q0 = q0 + (p1 - p0) * q;
      // In order to avoid trivial factorizations, save q1 values that are
      // small in a list. Only values that do not contain factors of the
      // multiplier must be saved; however, the GCD is 5x more expensive than
      // all the rest of the work performed in the loop. To avoid most GCDs,
      // only attempt it if q1 is less than the cutoff times the full multiplier
      //
      // If the queue overflows (very rare), signal that this multiplier failed
      // and move on to another one
      if (q1 < coarseCutoff) {
        final int t = q1 / IntegerUtils.gcd(q1, multiplier);
        if (t < cutoff) {
          if (numSaved >= QSIZE) {
            data.mFailed[multIdx] = true;
            return i;
          }
          saved[numSaved++] = (char) t;
        }
      }
      // If q0 is a perfect square, then the factorization has probably
      // succeeded. Most of the squareness tests out there require multiple
      // divisions and complicated loops. We can approximate these tests
      // by doing two things: testing that the number of trailing zeros in q0
      // is even, and then testing if q0 shifted right this many places is
      // 1 mod 8.
      int bits = 0;
      int tq0 = q0;
      while ((tq0 & 1) == 0) {
        ++bits;
        tq0 >>>= 1;
      }
      if ((bits & 1) == 0 && (tq0 & 7) == 1) {
        // q0 is probably a perfect square. Take the square root by cheating
        sqrtq = (int) LongUtils.sqrt(q0 & 0xFFFFFFFFL);
        if (sqrtq * sqrtq == q0) {
          // It *is* a perfect square. If it has not appeared previously in
          // the list for this multiplier, then we're almost finished
          int j;
          for (j = 0; j < numSaved; ++j) {
            if (saved[j] == sqrtq) {
              break;
            }
          }
          if (j == numSaved) {
            break;
          }
        }
      }
      // Perform the odd half of the SQUFOF cycle
      final int t0 = sqrtn + p0 - q0;
      final int qq = t0 >= q0 ? 1 + t0 / q0 : 1;
      p1 = qq * q0 - p0;
      q1 = q1 + (p0 - p1) * qq;
      if (q0 < coarseCutoff) {
        final int t = q0 / IntegerUtils.gcd(q0, multiplier);
        if (t < cutoff) {
          if (numSaved >= QSIZE) {
            data.mFailed[multIdx] = true;
            return i;
          }
          saved[numSaved++] = (char) t;
        }
      }
    }
    if (sqrtq == 1) {
      // The above found a trivial factor, so this multiplier has failed
      data.mFailed[multIdx] = true;
      return i;
    } else if (i == numIter) {
      // No square root found; save the parameters and go on to the next multiplier
      data.mQ0[multIdx] = q0;
      data.mP1[multIdx] = p1;
      data.mQ1[multIdx] = q1;
      data.mNumSaved[multIdx] = numSaved;
      return i;
    }
    // Square root found; the algorithm cannot fail now.
    // Compute the inverse quadratic form and iterate
    q0 = sqrtq;
    p1 = p0 + sqrtq * ((sqrtn - p0) / sqrtq);
    final long scaledn = data.mN * (long) MULTIPLIERS[multIdx];
    q1 = (int) ((scaledn - (long) p1 * (long) p1) / (long) q0);
    do {
      int tmp = sqrtn + p1 - q1;
      int q = tmp >= q1 ? 1 + tmp / q1 : 1;
      p0 = q * q1 - p1;
      q0 = q0 + (p1 - p0) * q;
      if (p0 == p1) {
        q0 = q1;
        break;
      }
      tmp = sqrtn + p0 - q0;
      q = tmp >= q0 ? 1 + tmp / q0 : 1;
      p1 = q * q0 - p0;
      q1 = q1 + (p0 - p1) * q;
    } while (p0 != p1);
    // q0 is the factor of n.
    // Remove factors that exist in the multiplier and save whatever's left
    q0 = q0 / IntegerUtils.gcd(q0, multiplier);
    // TODO pass this back out somehow
    mFactorFound = q0;
    return i;
  }

  private void updateFactorSequence(final FactorSequence fs, final Z n, final int exponent) {
    if (mPrime.isPrime(n)) {
      fs.add(n, FactorSequence.PRIME, exponent);
    } else {
      fs.add(n, FactorSequence.COMPOSITE, exponent);
      // Recurse on new composite factor
      factor(fs, n);
    }
  }

  /**
   * Attempt factorization by dividing n by each prime in turn. Processing
   * ends when the sieve exhausts its supply or primes, when <i>n</i> is completely
   * factored, or when all primes less the sqrt(<i>n</i>) have been tested.
   *
   * @param fs factor sequence containing n
   * @param n number to factor
   */
  @Override
  protected void factor(final FactorSequence fs, Z n) {

    final int exponent = fs.getExponent(n);
    final int status = fs.getStatus(n);
    fs.remove(n);
    n = AbstractFactorizer.handleEvenAndNegative(fs, n, exponent);
    if (n.equals(Z.ONE) || n.isZero()) {
      return;
    }
    if (n.bitLength() > 62) {
      fs.add(n, status, exponent);
      return;
    }

    // Factor a number up to 62 bits in size using SQUFOF. For n the product
    // of two primes, this routine will succeed with very high probability,
    // although the likelihood of failure goes up as n increases in size.
    // Empirically, 62-bit factorizations fail about 5% of the time; for
    // smaller n the failure rate is nearly zero.

    final SqufofData data = new SqufofData();
    data.mN = n.longValue();
    mFactorFound = 0;
    int i;
    for (i = 0; i < MULTIPLIERS.length; ++i) {
      // Use the multiplier if the multiplier times n will fit in 62 bits.
      // Because multipliers are initialized in order of increasing size, when
      // one is too big then all the rest are also too big
      final Z scaledN = n.multiply(MULTIPLIERS[i]);
      if (scaledN.bitLength() > 62) {
        break;
      }
      final Z sqrtScaledN = scaledN.sqrt();
      // Initialize the rest of the fields for this multiplier
      data.mSqrtN[i] = sqrtScaledN.intValue();
      data.mCutoff[i] = (int) Math.sqrt(2.0 * (double) data.mSqrtN[i]);
      data.mQ0[i] = 1;
      data.mP1[i] = data.mSqrtN[i];
      data.mQ1[i] = (int) (scaledN.longValue() - data.mP1[i] * data.mP1[i]);
      // If n is a perfect square, don't run the algorithm; the factorization
      // has already taken place
      if (data.mQ1[i] == 0) {
        updateFactorSequence(fs, Z.valueOf(data.mP1[i]), 2 * exponent);
        return;
      }
    }
    if (i == 0) {
      fs.add(n, status, exponent);
      return;
    }
    // Perform a block of work using each multiplier in turn, until our
    // budget of work for factoring n is exhausted
    final int numMult = i;
    int numIter = 0;
    int numFailed = 0;
    while (numIter < MAX_CYCLES) {
      // For each cycle of multipliers, begin with the multiplier that is
      // largest. These have a higher probability of factoring n quickly
      for (i = numMult - 1; i >= 0; --i) {
        if (data.mFailed[i]) {
          continue;
        }
        // Work on this multiplier for a little while
        numIter += oneCycle(data, i, ONE_CYCLE_ITER);
        // If all multipliers have failed, then SQUFOF has failed
        if (data.mFailed[i]) {
          if (++numFailed == numMult) {
            fs.add(n, status, exponent);
            return;
          }
        }
        if (mFactorFound > 1) {
          final Z w = Z.valueOf(mFactorFound);
          updateFactorSequence(fs, w, exponent);
          final Z newN = n.divide(w);
          updateFactorSequence(fs, newN, exponent);
          return;
        }
      }
    }
    fs.add(n, status, exponent);
  }


  /**
   * Attempt to factor each of the supplied arguments, printing a sorted list of factors.
   *
   * @param args numbers to factor
   */
  public static void main(final String[] args) {
    factorize(new Squfof(), args);
  }

}
