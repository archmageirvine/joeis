package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026878 <code>a(n) = T(2n+1,n+3)</code>, T given by <code>A026758</code>.
 * @author Sean A. Irvine
 */
public class A026878 extends A026758 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 3);
  }
}
