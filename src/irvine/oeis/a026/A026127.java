package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026127 <code>a(n) = T(2n-1,n-1)</code>, where T is the array in <code>A026120</code>.
 * @author Sean A. Irvine
 */
public class A026127 extends A026120 {

  private long mN = 0;

  @Override
  public Z next() {
    return u(2 * ++mN - 1, mN - 1);
  }
}
