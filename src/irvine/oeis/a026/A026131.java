package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026131 a(n) = T(2n,n-2), where T is the array in A026120.
 * @author Sean A. Irvine
 */
public class A026131 extends A026120 {

  private long mN = 0;

  @Override
  public Z next() {
    return u(2 * ++mN, mN - 2);
  }
}
