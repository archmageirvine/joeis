package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047122 T(n,n), array T as in A047120.
 * @author Sean A. Irvine
 */
public class A047122 extends A047120 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
