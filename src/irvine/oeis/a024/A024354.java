package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a020.A020883;

/**
 * A024354 Consider primitive Pythagorean triangles <code>(A^2 + B^2 = C^2, (A, B) = 1, A &lt;= B)</code>; sequence gives values of B, sorted and duplicates removed (first differs from <code>A020883</code> at <code>420)</code>.
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
