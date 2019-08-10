package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025140 <code>a(n) = floor(n/2)-th</code> elementary symmetric function of <code>C(n,0), C(n,1)</code>, ..., <code>C(n, floor(n/2))</code>.
 * @author Sean A. Irvine
 */
public class A025140 extends A025134 {

  private long mN = -1;

  @Override
  public Z next() {
    return sym(Z.ONE, 0, ++mN / 2, mN, mN / 2);
  }
}
