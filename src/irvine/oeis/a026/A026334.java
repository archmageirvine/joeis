package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026334 T(4n,n), where T is the array in A026323.
 * @author Sean A. Irvine
 */
public class A026334 extends A026323 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(4 * ++mN, mN);
  }
}
