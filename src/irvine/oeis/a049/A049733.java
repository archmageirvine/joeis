package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049733 a(n)=T(n,2), array T as in A049723.
 * @author Sean A. Irvine
 */
public class A049733 extends A049723 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, 2L));
  }
}
