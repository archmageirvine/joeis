package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027159 <code>a(n) = T(2n,n-1)</code>, T given by <code>A027157</code>.
 * @author Sean A. Irvine
 */
public class A027159 extends A027157 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(2 * ++mN, mN - 1);
  }
}
