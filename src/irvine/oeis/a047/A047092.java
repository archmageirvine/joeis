package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047092 T(n,n-1), array T as in A047089.
 * @author Sean A. Irvine
 */
public class A047092 extends A047089 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN);
  }
}
