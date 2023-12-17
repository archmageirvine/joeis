package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000593;

/**
 * A067229.
 * @author Sean A. Irvine
 */
public class A067435 extends Sequence1 {

  private final DirectSequence mSigmaOdd = new A000593();
  private int mN = 0;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 2) {
      mA = mA.add(4L * mN - 3).subtract(Jaguar.factor(2L * mN - 1).sigma()).subtract(mSigmaOdd.a(mN - 1));
    }
    return mA;
  }
}
