package irvine.oeis.a067;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067746 Denominator of ((3 * n - 2)/(n^(2 * n - 1) * (2 * n - 1) * 4^(n - 1))).
 * @author Sean A. Irvine
 */
public class A067746 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Q(Z.valueOf(3 * ++mN - 2), Z.valueOf(mN).pow(2 * mN - 1).multiply(2 * mN - 1).shiftLeft(2 * mN - 2)).den();
  }
}
