package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027128 <code>T(n,2n-10)</code>, T given by <code>A027113</code>.
 * @author Sean A. Irvine
 */
public class A027128 extends A027113 {

  private long mN = 4;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 10);
  }
}
