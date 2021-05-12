package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047068 T(n,n+3), array T as in A047060.
 * @author Sean A. Irvine
 */
public class A047068 extends A047060 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 3);
  }
}
