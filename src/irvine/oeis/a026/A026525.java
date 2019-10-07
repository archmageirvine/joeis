package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026525 <code>a(n) = T(2n,n)</code>, T given by <code>A026519</code>.
 * @author Sean A. Irvine
 */
public class A026525 extends A026519 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
