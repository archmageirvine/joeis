package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048454 Starting from generation 7 add previous and next term yielding generation 8.
 * @author Sean A. Irvine
 */
public class A048454 extends A048453 {

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
