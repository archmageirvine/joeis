package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049608 a(n)=T(n,n+2), array T as in A049600.
 * @author Sean A. Irvine
 */
public class A049608 extends A049600 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN + 2);
  }
}
