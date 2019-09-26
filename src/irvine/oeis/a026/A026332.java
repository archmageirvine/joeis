package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026332 <code>a(n) = T(2n,n)</code>, where T is the array in <code>A026323</code>.
 * @author Sean A. Irvine
 */
public class A026332 extends A026323 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
