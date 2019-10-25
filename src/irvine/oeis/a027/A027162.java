package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027162 <code>a(n) = T(2n-1,n-2)</code>, T given by <code>A027157</code>.
 * @author Sean A. Irvine
 */
public class A027162 extends A027157 {

  private long mN = 1;

  @Override
  public Z next() {
    return t(2 * ++mN - 1, mN - 2);
  }
}
