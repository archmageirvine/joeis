package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027120 <code>T(n,2n-2)</code>, T given by <code>A027113</code>.
 * @author Sean A. Irvine
 */
public class A027120 extends A027113 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 2);
  }
}
