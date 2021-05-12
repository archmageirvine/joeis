package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047137 a(n) = T(n,n+2), array T as in A047130.
 * @author Sean A. Irvine
 */
public class A047137 extends A047130 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 2);
  }
}
