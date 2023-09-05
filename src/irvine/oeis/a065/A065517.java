package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A065517 Numerator of n/(sum of the digits of n).
 * @author Sean A. Irvine
 */
public class A065517 extends Sequence1 {

  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(new Q(++mN, ZUtils.digitSum(mN)));
  }
}
