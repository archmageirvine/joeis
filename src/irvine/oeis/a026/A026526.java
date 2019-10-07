package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026526 <code>a(n) = T(2n,n-1)</code>, T given by <code>A026519</code>.
 * @author Sean A. Irvine
 */
public class A026526 extends A026519 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
