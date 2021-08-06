package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049609 a(n)=T(n,n+3), array T as in A049600.
 * @author Sean A. Irvine
 */
public class A049609 extends A049600 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN + 3);
  }
}
