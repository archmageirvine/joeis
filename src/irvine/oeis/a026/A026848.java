package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026848 <code>a(n) = T(2n,n-4)</code>, T given by <code>A026736</code>.
 * @author Sean A. Irvine
 */
public class A026848 extends A026736 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 4);
  }
}
