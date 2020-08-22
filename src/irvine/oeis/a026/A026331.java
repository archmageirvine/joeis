package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026331 a(n) = T(2n-1,n), where T is the array in A026323.
 * @author Sean A. Irvine
 */
public class A026331 extends A026323 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN);
  }
}
