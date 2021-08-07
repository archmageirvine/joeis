package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049793 a(n) = T(n,n-1), array T as in A049790.
 * @author Sean A. Irvine
 */
public class A049793 extends A049790 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : Z.valueOf(t(mN, mN - 1));
  }
}
