package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065409 Fennessey-Larcombe-French sequence.
 * @author Sean A. Irvine
 */
public class A065409 extends Sequence0 {

  private Z mA = Z.ONE;
  private Z mB = Z.EIGHT;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? mA : mB;
    }
    final Z n = Z.valueOf(mN);
    final Z n2 = n.square();
    final Z t = mB.multiply(n.multiply(24).subtract(32).multiply(n2).add(8))
      .add(mA.multiply(n2).multiply(n.multiply(-128).add(256)))
      .divide(n2.multiply(mN - 1));
    mA = mB;
    mB = t;
    return mB;
  }
}
