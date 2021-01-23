package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027146 a(n) = A027144(2n, n-1).
 * @author Sean A. Irvine
 */
public class A027146 extends A027144 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
