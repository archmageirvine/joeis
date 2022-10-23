package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A007911 a(n) = (n-1)!! - (n-2)!!.
 * @author Sean A. Irvine
 */
public class A007911 extends Sequence3 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  protected long mN = 0;

  @Override
  public Z next() {
    if (++mN > 2) {
      final Z t = mB.add(mA.multiply(mN).multiply(mN)).divide(mN - 1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
