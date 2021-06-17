package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048453 Starting from generation 6 add previous and next term yielding generation 7.
 * @author Sean A. Irvine
 */
public class A048453 extends A048452 {

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
