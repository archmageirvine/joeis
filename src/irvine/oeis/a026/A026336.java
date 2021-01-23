package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026336 a(n) = T(n,[ n/2 ]), where T is the array in A026323.
 * @author Sean A. Irvine
 */
public class A026336 extends A026323 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
