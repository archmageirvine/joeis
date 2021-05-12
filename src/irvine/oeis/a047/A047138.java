package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047138 a(n) = T(n,n+3), array T as in A047130.
 * @author Sean A. Irvine
 */
public class A047138 extends A047130 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 3);
  }
}
