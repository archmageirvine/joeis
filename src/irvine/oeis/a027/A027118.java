package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027118 <code>T(n,2n)</code>, T given by <code>A027113</code>.
 * @author Sean A. Irvine
 */
public class A027118 extends A027113 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, 2 * mN);
  }
}
