package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048449 Starting from generation 2 add previous and next term yielding generation 3.
 * @author Sean A. Irvine
 */
public class A048449 extends A048448 {

  private Z mB = Z.ZERO;
  {
    setOffset(0);
    super.next();
  }
  private Z mC = super.next();

  @Override
  public Z next() {
    final Z a = mB;
    mB = mC;
    mC = super.next();
    return a.add(mC);
  }
}
