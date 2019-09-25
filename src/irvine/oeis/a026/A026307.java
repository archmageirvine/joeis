package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026307 <code>a(n) = T(n,[ n/2 ])</code>, where T is the array in <code>A026300</code>.
 * @author Sean A. Irvine
 */
public class A026307 extends A026300 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN / 2);
  }
}
