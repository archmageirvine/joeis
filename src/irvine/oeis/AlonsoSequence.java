package irvine.oeis;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A287878.
 * @author Sean A. Irvine
 */
public class AlonsoSequence implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;
  private final Z mStart;
  private final int mBase;

  /**
   * Construct an Alonso sequence generator for a number and base.
   * @param n number to start from
   * @param base base to use
   */
  public AlonsoSequence(final long n, final int base) {
    mStart = Z.valueOf(n);
    mBase = base;
  }

  private Z flattenAlonso(final FactorSequence fs, final int base) {
    final StringBuilder sb = new StringBuilder();
    for (final Z p : fs.toZArray()) {
      sb.append(p.toString(base));
      final int e = fs.getExponent(p);
      if (e > 1) {
        sb.append(Integer.toString(fs.getExponent(p), base));
      }
    }
    return new Z(sb.toString(), base);
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
      mA = flattenAlonso(fs, mBase);
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
    final AlonsoSequence seq = new AlonsoSequence(Long.parseLong(args[0]), Integer.parseInt(args[1]));
    Z t;
    while ((t = seq.next()) != null) {
      System.out.println(t);
    }
  }
}

