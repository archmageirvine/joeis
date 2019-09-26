package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026336 <code>a(n) = T(n,[ n/2 ])</code>, where T is the array in <code>A026323</code>.
 * @author Sean A. Irvine
 */
public class A026336 extends A026323 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
