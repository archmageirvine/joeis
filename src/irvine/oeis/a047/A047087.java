package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047087 a(n) = A047080(2*n, n+1).
 * @author Sean A. Irvine
 */
public class A047087 extends A047080 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 1);
  }
}
