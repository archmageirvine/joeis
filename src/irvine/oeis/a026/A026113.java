package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026113 T(3n,n), where T is the array defined in A026105.
 * @author Sean A. Irvine
 */
public class A026113 extends A026105 {

  private long mN = -1;

  @Override
  public Z next() {
    return m(3 * ++mN, mN);
  }
}
