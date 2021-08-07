package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049734 a(n)=T(n,3), array T as in A049723.
 * @author Sean A. Irvine
 */
public class A049734 extends A049723 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, 3L));
  }
}
