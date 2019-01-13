package irvine.oeis.a248;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Date;

/**
 * A248037.
 *
 * This program was used in the confirmation of a(15)=3743559068799. It
 * essentially performs an exhaustive search with some additional smarts
 * to avoid evaluating useless candidates.  There are C, Java, and Python
 * versions of this code that are roughly equivalent.
 *
 * We precompute the exact count of triples and halvings for all values less
 * than PRECOMPUTE.  During the actual search we can then truncate the
 * calculation whenever we reach a value less than PRECOMPUTE and simply add
 * the cached counts to the current values.  This saves computing all the
 * way to 1 for every number.
 * 
 * If during the Collatz calculation for n we arrive at some number m,
 * smaller than n and the ratio triples/halves is less than the current
 * best, then the number n can be discarded.
 *
 * For sufficiently large n, n can only be a member of the sequence if
 * n = 7, 15, 27, or 31 (mod 32).  This is because all other values provably
 * have a ratio triples/halvings of less than 0.6.
 *
 * Most values of n less than, say, about 2^50, can be calculated using
 * 63 or 64-bit arithmetic.  We detect when this is not the case by
 * checking if overflow will occur on a tripling step.  When such an
 * overflow is detected, the entire calculation for that number is redone
 * using big number arithmetic.
 *
 * @author Sean A. Irvine
 * @author David Consiglio, Jr.
 */
public class A248037 implements Sequence {

  private static final long MAX_INTERMEDIATE = (Long.MAX_VALUE - 1) / 3;
  private static final int PRECOMPUTE = 1000000;
  private static final Z Z_PRECOMPUTE = Z.valueOf(PRECOMPUTE);
  private final int[] mCacheHalves = new int[PRECOMPUTE];
  private final int[] mCacheTriples = new int[PRECOMPUTE];
  private boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = -1;
  private long mLimit = Long.MAX_VALUE - 2;
  private long mBestTriples = -1;
  private long mBestHalves = 1;
  private long mTested = 0;
  private long mExtended = 0;

  private void collatzRatioPrecompute(final int n) {
    // Limit on pre-computation is low enough that this will never overflow
    int halves = 0;
    int triples = 0;
    long m = n;
    while (m > 1) {
      if ((m & 1) == 1) {
        m = 3 * m + 1;
        ++triples;
      }
      do {
        m >>>= 1;
        ++halves;
      } while ((m & 1) == 0);
    }
    mCacheHalves[n] = halves;
    mCacheTriples[n] = triples;
  }

  {
    for (int k = 1; k < PRECOMPUTE; ++k) {
      collatzRatioPrecompute(k);
    }
  }

  private boolean collatzRatio(final long n) {
    long halves = 0;
    long triples = 0;
    long halvesScaled = 0;
    long triplesScaled = 0;
    long m = n;
    while (m >= PRECOMPUTE) {
      if (m < n && triplesScaled < halvesScaled) {
        return false;
      }
      if ((m & 1) == 1) {
        if (m > MAX_INTERMEDIATE) {
          throw new ArithmeticException();
        }
        m = 3 * m + 1;
        ++triples;
        triplesScaled += mBestHalves;
      }
      assert (m & 1) == 0;
      do {
        m >>>= 1;
        ++halves;
        halvesScaled += mBestTriples;
      } while ((m & 1) == 0);
    }
    triples += mCacheTriples[(int) m];
    halves += mCacheHalves[(int) m];
    if (triples * mBestHalves > halves * mBestTriples) {
      mBestTriples = triples;
      mBestHalves = halves;
      return true;
    }
    return false;
  }

  private boolean collatzRatio(final Z n) {
    long halves = 0;
    long triples = 0;
    long triplesScaled = 0;
    long halvesScaled = 0;
    Z m = n;
    while (m.compareTo(Z_PRECOMPUTE) >= 0) {
      if (m.compareTo(n) < 0 && triplesScaled < halvesScaled) {
        return false;
      }
      if (!m.isEven()) {
        m = m.multiply(3).add(1);
        ++triples;
        triplesScaled += mBestHalves;
      }
      assert m.isEven();
      final Z t = m.makeOdd();
      final long aux = m.auxiliary();
      halves += aux;
      halvesScaled += aux * mBestTriples;
      m = t;
    }
    final int u = m.intValueExact();
    triples += mCacheTriples[u];
    halves += mCacheHalves[u];
    if (triples * mBestHalves > halves * mBestTriples) {
      mBestTriples = triples;
      mBestHalves = halves;
      return true;
    }
    return false;
  }

  @Override
  public Z next() {
    if (mN < 1) {
      mN = 1;
      return Z.TWO;
    }
    while (mN <= 8400511) {
      // Early terms do not all obey provable residue classes for later terms
      mN += 2;
      try {
        if (collatzRatio(mN)) {
          if (mVerbose) {
            System.out.println(Date.now() + " Ratio: " + mBestTriples + "/" + mBestHalves + " = " + mBestTriples / (double) mBestHalves);
          }
          return Z.valueOf(mN);
        }
      } catch (final ArithmeticException e) {
        throw new RuntimeException(e); // Should not happen on small inputs
      }
    }
    final long r8 = mN & 7;
    if (r8 == 1 || r8 == 5) {
      mN -= 2;
    }
    while (mN < mLimit) {
      mN += 4;
      final long r = mN & 31;
      if (r == 7 || r == 15 || r == 27 || r == 31) {
        boolean test;
        try {
          test = collatzRatio(mN);
        } catch (final ArithmeticException e) {
          test = collatzRatio(Z.valueOf(mN));
          ++mExtended;
        }
        if (test) {
          if (mVerbose) {
            System.out.println(Date.now() + " Ratio: " + mBestTriples + "/" + mBestHalves + " = " + mBestTriples / (double) mBestHalves);
          }
          return Z.valueOf(mN);
        }
        if (mVerbose && ++mTested == 1000000000L) {
          System.out.println(Date.now() + " Tested: " + mN + " (" + mExtended + " extended)");
          mTested = 0;
          mExtended = 0;
        }
      }
    }
    if (mLimit == Long.MAX_VALUE - 2) {
      throw new UnsupportedOperationException();
    }
    if (mVerbose) {
      System.out.println(Date.now() + " Tested: " + mN + " (" + mExtended + " extended)");
    }
    return null;
  }

  /**
   * Search a specific range.
   * @param args start end triples halves
   */
  public static void main(final String[] args) {
    // Usage: start end besty bestx
    final A248037 seq = new A248037();
    seq.mN = (Long.parseLong(args[0]) | 1) - 2;
    seq.mLimit = Long.parseLong(args[1]);
    seq.mBestTriples = Long.parseLong(args[2]);
    seq.mBestHalves = Long.parseLong(args[3]);
    seq.mVerbose = true;
    Z t;
    while ((t = seq.next()) != null) {
      System.out.println(t);
    }
  }
}
