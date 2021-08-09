package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049638 a(n) = T(n,4), array T as in A049627.
 * @author Sean A. Irvine
 */
public class A049638 extends A049627 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, 4));
  }
}
