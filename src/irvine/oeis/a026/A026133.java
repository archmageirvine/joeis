package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026133 <code>a(n) = T(n,[ n/2 ] - 1)</code>, where T is the array in <code>A026120</code>.
 * @author Sean A. Irvine
 */
public class A026133 extends A026120 {

  private long mN = -1;

  @Override
  public Z next() {
    return u(++mN, mN / 2 - 1);
  }
}
