package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027015 <code>T(2n,n+4)</code>, T given by <code>A027011</code>.
 * @author Sean A. Irvine
 */
public class A027015 extends A027011 {

  private long mN = 3;

  @Override
  public Z next() {
    return ++mN == 4 ? Z.ONE : t(2 * mN, mN + 4);
  }
}
