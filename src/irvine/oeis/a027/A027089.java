package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027089 <code>T(n,2n-2)</code>, T given by <code>A027082</code>.
 * @author Sean A. Irvine
 */
public class A027089 extends A027082 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 2);
  }
}
