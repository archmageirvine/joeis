package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047063 T(n,n-1), array T as in A047060.
 * @author Sean A. Irvine
 */
public class A047063 extends A047060 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
