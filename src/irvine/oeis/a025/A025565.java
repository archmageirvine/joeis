package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025565 a(n) = T(n,n-1), where T is array defined in A025564.
 * @author Sean A. Irvine
 */
public class A025565 extends A025564 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
