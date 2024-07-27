package irvine.oeis.a071;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071527 Numbers k such that the simple continued fraction for (1+1/k)^k contains k.
 * @author Sean A. Irvine
 */
public class A071527 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (ContinuedFractionUtils.continuedFraction(new Q(mN + 1, mN).pow(mN)).contains(n)) {
        return n;
      }
    }
  }
}
