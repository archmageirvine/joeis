package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047148 T(n,n+3), array T as in A047140.
 * @author Sean A. Irvine
 */
public class A047148 extends A047140 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 3);
  }
}
