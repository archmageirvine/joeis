package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049796 a(n) = T(n,n-4), array T as in A049790.
 * @author Sean A. Irvine
 */
public class A049796 extends A049790 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN <= 4 ? Z.valueOf(mN) : Z.valueOf(t(mN, mN - 4));
  }
}
