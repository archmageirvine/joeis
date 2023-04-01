package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062501.
 * @author Sean A. Irvine
 */
public class A062469 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final CR n = CR.valueOf(mN);
    return n.log().multiply(n).pow(n.pow(new Q(-1, mN))).floor();
  }
}
