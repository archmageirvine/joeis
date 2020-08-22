package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026112 a(n) = T(2n,n), where T is the array defined in A026105.
 * @author Sean A. Irvine
 */
public class A026112 extends A026105 {

  private long mN = -1;

  @Override
  public Z next() {
    return m(2 * ++mN, mN);
  }
}
