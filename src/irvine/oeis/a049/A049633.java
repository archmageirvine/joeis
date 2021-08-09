package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049633 a(n) = T(n,n+1), array T as in A049627.
 * @author Sean A. Irvine
 */
public class A049633 extends A049627 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN + 1));
  }
}
