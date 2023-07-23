package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026130 T(4n,n), where T is the array in A026120.
 * @author Sean A. Irvine
 */
public class A026130 extends A026120 {

  {
    setOffset(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return u(4 * ++mN, mN - 1);
  }
}
