package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047035 T(n,n-3), array T as in A047030.
 * @author Sean A. Irvine
 */
public class A047035 extends A047030 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
