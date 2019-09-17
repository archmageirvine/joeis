package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026111 <code>a(n) = T(2n-1,n)</code>, where T is the array defined in <code>A026105</code>.
 * @author Sean A. Irvine
 */
public class A026111 extends A026105 {

  private long mN = 1;

  @Override
  public Z next() {
    return m(2 * ++mN - 1, mN);
  }
}
