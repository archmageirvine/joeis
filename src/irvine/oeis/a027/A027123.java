package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027123 <code>T(n,2n-5)</code>, T given by <code>A027113</code>.
 * @author Sean A. Irvine
 */
public class A027123 extends A027113 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 5);
  }
}
