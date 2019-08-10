package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025141 <code>a(n) = (k-1)st</code> elementary symmetric function of <code>C(n,0), C(n,1)</code>, ..., <code>C(n,k)</code>, where k <code>= floor( n/2 )</code>.
 * @author Sean A. Irvine
 */
public class A025141 extends A025134 {

  private long mN = 1;

  @Override
  public Z next() {
    return sym(Z.ONE, 0, ++mN / 2, mN, mN / 2 - 1);
  }
}
