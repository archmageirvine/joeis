package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049694 a(n)=T(n,n+3), array T as in A049687.
 * @author Sean A. Irvine
 */
public class A049694 extends A049687 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN + 3));
  }
}
