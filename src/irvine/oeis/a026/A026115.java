package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026115 a(n) = T(2n,n-1), where T is the array defined in A026105.
 * @author Sean A. Irvine
 */
public class A026115 extends A026105 {

  {
    setOffset(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return m(2 * ++mN, mN - 1);
  }
}
