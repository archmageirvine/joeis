package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026333 <code>a(n) = T(3n,n)</code>, where T is the array in <code>A026323</code>.
 * @author Sean A. Irvine
 */
public class A026333 extends A026323 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(3 * ++mN, mN);
  }
}
