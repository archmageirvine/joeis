package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026742 <code>a(n) = T(n, floor(n/2))</code>, T given by <code>A026736</code>.
 * @author Sean A. Irvine
 */
public class A026742 extends A026736 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
