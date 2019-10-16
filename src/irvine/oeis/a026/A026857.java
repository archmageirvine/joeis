package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026857 <code>a(n) = T(2n+1,n+4)</code>, T given by <code>A026736</code>.
 * @author Sean A. Irvine
 */
public class A026857 extends A026736 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 4);
  }
}
