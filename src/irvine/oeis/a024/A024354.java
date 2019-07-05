package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a020.A020883;

/**
 * A024354.
 * @author Sean A. Irvine
 */
public class A024354 extends A020883 {

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
