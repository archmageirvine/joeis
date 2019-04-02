package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A002940 Arrays of dumbbells.
 * @author Sean A. Irvine
 */
public class A002940 extends A000045 {

  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mC = Z.ZERO;
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z r = mC.multiply2().subtract(mA).add(super.next());
    mA = mB;
    mB = mC;
    mC = r;
    return r;
  }
}
