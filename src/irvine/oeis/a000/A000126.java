package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000126 A nonlinear binomial sum.
 * @author Sean A. Irvine
 */
public class A000126 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z r = mA.add(mB).add(++mN).subtract(2);
    mA = mB;
    mB = r;
    return r;
  }
}
