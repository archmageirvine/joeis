package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026759 <code>a(n) = T(2n, n)</code>, T given by <code>A026758</code>.
 * @author Sean A. Irvine
 */
public class A026759 extends A026758 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
