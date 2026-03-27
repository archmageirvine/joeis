package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.q.QUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A305213.
 * @author Sean A. Irvine
 */
public class A394506 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return select(QUtils.binomial(new Q(1, mN), mM));
  }
}
