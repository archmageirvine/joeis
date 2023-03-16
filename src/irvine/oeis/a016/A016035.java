package irvine.oeis.a016;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016035 a(n) = Sum_{j|n, 1 &lt; j &lt; n} phi(j). Also a(n) = n - phi(n) - 1 for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A016035 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return Z.valueOf(mN - Euler.phiAsLong(mN) - 1);
  }
}
