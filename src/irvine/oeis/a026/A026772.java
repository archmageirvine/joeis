package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026772 <code>a(n) = T(2n, n-2)</code>, T given by <code>A026769</code>.
 * @author Sean A. Irvine
 */
public class A026772 extends A026769 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
