package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a020.A020883;

/**
 * A024360 Consider primitive Pythagorean triangles <code>(A^2 + B^2 = C^2, (A, B) = 1, A &lt;= B)</code>; sequence gives number of times B takes value <code>n</code>.
 * @author Sean A. Irvine
 */
public class A024360 extends A020883 {

  private Z mA = super.next();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    long c = 0;
    mN = mN.add(1);
    while (mN.equals(mA)) {
      ++c;
      mA = super.next();
    }
    return Z.valueOf(c);
  }
}
