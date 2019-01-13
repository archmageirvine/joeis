package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002848.
 * @author Sean A. Irvine
 */
public class A002848 extends A002849 {

  // After Franklin T. Adams-Watters

  private int mN = -1;
  private Z mPrev = super.next();

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ZERO;
    }
    final Z t = super.next();
    final int r = mN % 12;
    final Z res;
    if (r == 0 || r == 3 || r == 7 || r == 10) {
      res = t;
    } else {
      res = t.subtract(mPrev);
    }
    mPrev = t;
    return res;
  }
}
