package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026650 <code>a(n) = T(2n,n-1)</code>, T given by <code>A026648</code>.
 * @author Sean A. Irvine
 */
public class A026650 extends A026648 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
