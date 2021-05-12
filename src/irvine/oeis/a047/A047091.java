package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047091 T(n,n), array T as in A047089.
 * @author Sean A. Irvine
 */
public class A047091 extends A047089 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
