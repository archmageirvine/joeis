package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027149 <code>T(2n-1,n-2)</code>, T given by <code>A027144</code>.
 * @author Sean A. Irvine
 */
public class A027149 extends A027144 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
