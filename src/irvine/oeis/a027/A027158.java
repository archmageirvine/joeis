package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027158 <code>a(n) = T(2n,n)</code>, T given by <code>A027157</code>.
 * @author Sean A. Irvine
 */
public class A027158 extends A027157 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(2 * ++mN, mN);
  }
}
