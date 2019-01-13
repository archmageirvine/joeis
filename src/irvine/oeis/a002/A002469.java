package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000166;

/**
 * A002469.
 * @author Sean A. Irvine
 */
public class A002469 extends A000166 {

  private long mN = -3;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    final Z t = mA;
    mA = super.next();
    return Z.ZERO.max(t.multiply(mN).add(mA.multiply(mN + 1)));
  }

}
