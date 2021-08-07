package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049789 a(n) = T(n,n-4), array T as in A049783.
 * @author Sean A. Irvine
 */
public class A049789 extends A049783 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN - 4));
  }
}
