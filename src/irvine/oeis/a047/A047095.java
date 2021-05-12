package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047095 T(n,n+1), array T as in A047089.
 * @author Sean A. Irvine
 */
public class A047095 extends A047089 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN);
  }
}
