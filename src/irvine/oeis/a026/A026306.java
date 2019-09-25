package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026306 <code>a(n) = T(2n,n+1)</code>, where T is the array in <code>A026300</code>.
 * @author Sean A. Irvine
 */
public class A026306 extends A026300 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(2 * ++mN, mN + 1);
  }
}
