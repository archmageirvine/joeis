package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048452 Starting from generation 5 add previous and next term yielding generation 6.
 * @author Sean A. Irvine
 */
public class A048452 extends A048451 {

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
