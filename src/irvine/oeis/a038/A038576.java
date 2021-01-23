package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A038576 CONTINUANT transform of {phi(n)}, 1, 1, 2, 2, 4, 2, .. (A002088).
 * @author Sean A. Irvine
 */
public class A038576 extends A000010 {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = super.next().multiply(mA).add(t);
    return mB;
  }
}
