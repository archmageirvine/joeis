package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026675 <code>a(n) = T(2n-1,n-2)</code>, T given by <code>A026670</code>. Also <code>T(2n-1,n-2) = T(2n,n+2)</code>, T given by <code>A026725</code> and <code>T(2n,n-2)</code>, T given by <code>A026736</code>.
 * @author Sean A. Irvine
 */
public class A026675 extends A026670 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
