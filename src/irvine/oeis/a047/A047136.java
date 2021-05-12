package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047136 a(n) = T(n,n+1), array T as in A047130.
 * @author Sean A. Irvine
 */
public class A047136 extends A047130 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 1);
  }
}
