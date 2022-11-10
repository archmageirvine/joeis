package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047088 a(n) = A047080(2*n+1, n+2).
 * @author Sean A. Irvine
 */
public class A047088 extends A047080 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 2);
  }
}
