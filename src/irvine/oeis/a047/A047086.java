package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047086 a(n) = T(2*n+1, n), array T as in A047080.
 * @author Sean A. Irvine
 */
public class A047086 extends A047080 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN);
  }
}
