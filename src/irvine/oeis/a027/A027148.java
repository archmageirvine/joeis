package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027148 <code>a(n) = A027144(2n-1, n-1)</code>.
 * @author Sean A. Irvine
 */
public class A027148 extends A027144 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 1);
  }
}
