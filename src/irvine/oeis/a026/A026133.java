package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026133 a(n) = T(n,[ n/2 ] - 1), where T is the array in A026120.
 * @author Sean A. Irvine
 */
public class A026133 extends A026120 {

  private long mN = -1;

  @Override
  public Z next() {
    return u(++mN, mN / 2 - 1);
  }
}
