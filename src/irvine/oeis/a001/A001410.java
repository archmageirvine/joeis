package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001410 Sum of rows of triangle defined in <code>A001404</code>.
 * @author Sean A. Irvine
 */
public class A001410 extends A001404 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long m = 0; m <= mN; ++m) {
      s = s.add(get(mN, m));
    }
    return s;
  }
}
