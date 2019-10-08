package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026649 <code>a(n) = T(2n,n)</code>, T given by <code>A026648</code>.
 * @author Sean A. Irvine
 */
public class A026649 extends A026648 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
