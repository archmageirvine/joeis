package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A001629.
 * @author Sean A. Irvine
 */
public class A001629 extends A000045 {

  private Z mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = super.next();
      return Z.ZERO;
    }
    final Z f = super.next();
    final Z t = mA.multiply(++mN).multiply2().add(f.multiply(mN - 1));
    mA = f;
    return t.divide(5);
  }
}
