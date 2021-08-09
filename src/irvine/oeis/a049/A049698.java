package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049698 a(n) = T(n,n+2), array T as in A049695.
 * @author Sean A. Irvine
 */
public class A049698 extends A049695 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN + 2));
  }
}
