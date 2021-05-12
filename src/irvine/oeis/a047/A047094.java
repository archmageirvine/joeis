package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047094 T(n,n-3), array T as in A047089.
 * @author Sean A. Irvine
 */
public class A047094 extends A047089 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN - 3, mN);
  }
}
