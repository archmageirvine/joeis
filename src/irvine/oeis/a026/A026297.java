package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026297 <code>a(n) = T(n,[ n/2 ])</code>, where T is the array in <code>A026268</code>.
 * @author Sean A. Irvine
 */
public class A026297 extends A026268 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
