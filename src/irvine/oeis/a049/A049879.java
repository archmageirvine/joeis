package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049879 a(n) = |j - k|, where u(n) = u(j) + u(k) is the unique sum of Ulam numbers described in A002859 (with 1 &lt;= j &lt; k &lt; n).
 * @author Sean A. Irvine
 */
public class A049879 extends A049821 {

  {
    setOffset(3);
  }

  @Override
  protected Z select(final int k, final int j) {
    return Z.valueOf(k - j);
  }
}
