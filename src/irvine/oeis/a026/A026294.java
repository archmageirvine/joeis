package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026294 T(4n,n), where T is the array in A026268.
 * @author Sean A. Irvine
 */
public class A026294 extends A026268 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(4 * ++mN, mN);
  }
}
