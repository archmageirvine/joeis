package irvine.oeis;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A sequence arising in the concatenation of the prime factors of a number.
 * @author Sean A. Irvine
 */
public class ConcatenatedPrimeFactorizationSequence extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;
  private final Z mStart;
  private final int mBase;

  /**
   * Construct a concatenated prime factorization sequence for a given number and base.
   * @param n number to start from
   * @param base base to use
   */
  public ConcatenatedPrimeFactorizationSequence(final long n, final int base) {
    mStart = Z.valueOf(n);
    mBase = base;
  }

  private Z flatten(final FactorSequence fs, final int base) {
    final StringBuilder sb = new StringBuilder();
    for (final Z p : fs.toZArray()) {
      sb.append(p.toString(base));
      final int e = fs.getExponent(p);
      if (e > 1) {
        sb.append(Integer.toString(fs.getExponent(p), base));
      }
    }
    return new Z(sb, base);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
    } else {
      if (mA.isProbablePrime(32)) {
        if (mVerbose) {
          System.out.println("Prime: " + mA);
        }
        return null; // finished at a prime
      }
      final FactorSequence fs = Jaguar.factor(mA);
      mA = flatten(fs, mBase);
    }
    if (mSeen.add(mA)) {
      return mA;
    } else {
      if (mVerbose) {
        System.out.println("Cycle detected: " + mA);
      }
      return null; // cycle detected
    }
  }

  /**
   * Run a particular number and base.
   * @param args number base
   */
  public static void main(final String[] args) {
    final ConcatenatedPrimeFactorizationSequence seq = new ConcatenatedPrimeFactorizationSequence(Long.parseLong(args[0]), Integer.parseInt(args[1]));
    Z t;
    while ((t = seq.next()) != null) {
      System.out.println(t);
    }
  }
}

