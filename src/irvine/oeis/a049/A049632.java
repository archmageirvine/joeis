package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049632 a(n) = T(n,n), array T as in A049627.
 * @author Sean A. Irvine
 */
public class A049632 extends A049627 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN));
  }
}
