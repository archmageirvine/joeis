package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026129 a(n) = T(3n,n), where T is the array in A026120.
 * @author Sean A. Irvine
 */
public class A026129 extends A026120 {

  {
    setOffset(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return u(3 * ++mN, mN - 1);
  }
}
