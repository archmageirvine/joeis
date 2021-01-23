package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024614 Numbers of the form x^2 + xy + y^2, where x and y are positive integers.
 * @author Sean A. Irvine
 */
public class A024614 extends A024612 {

  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    Z res;
    do {
      res = super.next();
    } while (res.equals(mPrev));
    mPrev = res;
    return res;
  }
}
