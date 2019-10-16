package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026842 <code>a(n) = T(2n,n-3)</code>, T given by <code>A026725</code>.
 * @author Sean A. Irvine
 */
public class A026842 extends A026725 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 3);
  }
}
