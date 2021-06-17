package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048451 Starting from generation 4 add previous and next term yielding generation 5.
 * @author Sean A. Irvine
 */
public class A048451 extends A048450 {

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
