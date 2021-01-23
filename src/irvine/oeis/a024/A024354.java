package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a020.A020883;

/**
 * A024354 Consider primitive Pythagorean triangles (A^2 + B^2 = C^2, (A, B) = 1, A &lt;= B); sequence gives values of B, sorted and duplicates removed (first differs from A020883 at 420).
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
