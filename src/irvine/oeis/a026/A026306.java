package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026306 a(n) = T(2n,n+1), where T is the array in A026300.
 * @author Sean A. Irvine
 */
public class A026306 extends A026300 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(2 * ++mN, mN + 1);
  }
}
