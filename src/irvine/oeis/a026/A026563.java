package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026563 <code>a(n) = T(n,[ n/2 ])</code>, T given by <code>A026552</code>.
 * @author Sean A. Irvine
 */
public class A026563 extends A026552 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
