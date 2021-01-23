package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026114 T(4n,n), where T is the array defined in A026105.
 * @author Sean A. Irvine
 */
public class A026114 extends A026105 {

  private long mN = -1;

  @Override
  public Z next() {
    return m(4 * ++mN, mN);
  }
}
