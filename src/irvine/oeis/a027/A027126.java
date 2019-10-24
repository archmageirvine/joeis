package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027126 <code>T(n,2n-8)</code>, T given by <code>A027113</code>.
 * @author Sean A. Irvine
 */
public class A027126 extends A027113 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 8);
  }
}
