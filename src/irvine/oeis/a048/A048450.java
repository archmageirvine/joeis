package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048450 Starting from generation 3 add previous and next term yielding generation 4.
 * @author Sean A. Irvine
 */
public class A048450 extends A048449 {

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
