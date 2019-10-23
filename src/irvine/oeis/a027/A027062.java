package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027062 <code>T(n,2n-6)</code>, T given by <code>A027052</code>.
 * @author Sean A. Irvine
 */
public class A027062 extends A027052 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 6);
  }
}
