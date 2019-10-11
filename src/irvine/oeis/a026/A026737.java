package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026737 <code>a(n) = T(2*n,n)</code>, T given by <code>A026736</code>.
 * @author Sean A. Irvine
 */
public class A026737 extends A026736 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
