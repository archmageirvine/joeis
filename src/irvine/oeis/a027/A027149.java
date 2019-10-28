package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027149 <code>a(n) = A027144(2n-1, n-2)</code>.
 * @author Sean A. Irvine
 */
public class A027149 extends A027144 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
