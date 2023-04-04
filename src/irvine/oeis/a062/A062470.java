package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062470 Nearest integer to log(n^n)^(n^(-1/n)).
 * @author Sean A. Irvine
 */
public class A062470 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final CR n = CR.valueOf(mN);
    return n.log().multiply(n).pow(n.pow(new Q(-1, mN))).round();
  }
}
