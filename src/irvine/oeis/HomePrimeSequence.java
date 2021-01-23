package irvine.oeis;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Generate home prime sequences.
 * @author Sean A. Irvine
 */
public class HomePrimeSequence implements Sequence {

  private final int mBase;
  private final boolean mTerminateOnPrime;
  private Z mA;
  private boolean mFirst = true;

  protected HomePrimeSequence(final long start, final int base, final boolean terminateOnPrime) {
    mA = Z.valueOf(start);
    mBase = base;
    mTerminateOnPrime = terminateOnPrime;
  }

  /**
   * Construct the home prime sequence for a given value.
   * @param start starting number
   */
  public HomePrimeSequence(final long start) {
    this(start, 10, true);
  }

  @Override
  public Z next() {
    if (mA == null) {
      return null;
    }
    if (mFirst) {
      mFirst = false;
      final Z res = mA;
      mA = mTerminateOnPrime && res.isProbablePrime() ? null : res;
      return res;
    }
    final StringBuilder sb = new StringBuilder();
    final FactorSequence fs = Jaguar.factor(mA);
    for (final Z p : fs.toZArray()) {
      final String rep = p.toString(mBase);
      for (int k = 0; k < fs.getExponent(p); ++k) {
        sb.append(rep);
      }
    }
    final Z res = new Z(sb, mBase);
    mA = mTerminateOnPrime && res.isProbablePrime() ? null : res;
    return res;
  }
}
