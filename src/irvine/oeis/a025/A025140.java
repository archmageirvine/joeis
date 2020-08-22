package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025140 a(n) = floor(n/2)-th elementary symmetric function of C(n,0), C(n,1), ..., C(n, floor(n/2)).
 * @author Sean A. Irvine
 */
public class A025140 extends A025134 {

  private long mN = -1;

  @Override
  public Z next() {
    return sym(Z.ONE, 0, ++mN / 2, mN, mN / 2);
  }
}
