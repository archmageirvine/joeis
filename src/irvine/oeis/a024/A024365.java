package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024365.
 * @author Sean A. Irvine
 */
public class A024365 extends A024406 {

  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.equals(mPrev));
    mPrev = t;
    return mPrev;
  }
}
