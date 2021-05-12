package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047144 T(n,n-2), array T as in A047140.
 * @author Sean A. Irvine
 */
public class A047144 extends A047140 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
