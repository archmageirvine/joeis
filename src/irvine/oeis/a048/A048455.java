package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048455 Starting from generation 8 add previous and next term yielding generation 9.
 * @author Sean A. Irvine
 */
public class A048455 extends A048454 {

  private Z mB = Z.ZERO;
  private Z mC = super.next();

  @Override
  public Z next() {
    final Z a = mB;
    mB = mC;
    mC = super.next();
    return a.add(mC);
  }
}
