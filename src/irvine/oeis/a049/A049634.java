package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049634 a(n)=T(n,n+2), array T as in A049627.
 * @author Sean A. Irvine
 */
public class A049634 extends A049627 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN + 2));
  }
}
