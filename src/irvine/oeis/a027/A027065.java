package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027065 <code>T(n,2n-9)</code>, T given by <code>A027052</code>.
 * @author Sean A. Irvine
 */
public class A027065 extends A027052 {

  private long mN = 4;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 9);
  }
}
