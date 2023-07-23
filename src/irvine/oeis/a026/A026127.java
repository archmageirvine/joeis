package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026127 a(n) = T(2n-1,n-1), where T is the array in A026120.
 * @author Sean A. Irvine
 */
public class A026127 extends A026120 {

  {
    setOffset(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return u(2 * ++mN - 1, mN - 1);
  }
}
