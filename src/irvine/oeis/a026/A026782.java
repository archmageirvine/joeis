package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026782 <code>a(n) = T(2n,n-1)</code>, T given by <code>A026780</code>.
 * @author Sean A. Irvine
 */
public class A026782 extends A026780 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
