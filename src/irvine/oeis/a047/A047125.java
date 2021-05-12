package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047125 T(n,n-3), array T as in A047120.
 * @author Sean A. Irvine
 */
public class A047125 extends A047120 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
