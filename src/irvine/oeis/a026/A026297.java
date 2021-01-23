package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026297 a(n) = T(n,[ n/2 ]), where T is the array in A026268.
 * @author Sean A. Irvine
 */
public class A026297 extends A026268 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
