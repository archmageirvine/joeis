package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025565 <code>a(n) = T(n,n-1)</code>, where T is array defined in <code>A025564</code>.
 * @author Sean A. Irvine
 */
public class A025565 extends A025564 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
