package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026307 a(n) = T(n,[ n/2 ]), where T is the array in A026300.
 * @author Sean A. Irvine
 */
public class A026307 extends A026300 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN / 2);
  }
}
