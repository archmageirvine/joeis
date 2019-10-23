package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027059 <code>T(n,2n-3)</code>, T given by <code>A027052</code>.
 * @author Sean A. Irvine
 */
public class A027059 extends A027052 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 3);
  }
}
