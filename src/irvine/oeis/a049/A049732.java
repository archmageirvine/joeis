package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049732 a(n)=T(n,1), array T as in A049723.
 * @author Sean A. Irvine
 */
public class A049732 extends A049723 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, 1L));
  }
}
