package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026291 a(n) = T(2n-1,n), where T is the array in A026268.
 * @author Sean A. Irvine
 */
public class A026291 extends A026268 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN);
  }
}
