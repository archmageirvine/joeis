package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036301.
 * @author Sean A. Irvine
 */
public class A076174 extends Sequence1 {

  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (long i = 1; i < mN; ++i) {
      for (long j = i; i + j < mN; ++j) {
        sum = sum.add(new Q(i * j, mN - i - j).multiply(i == j ? 1 : 2));
      }
    }
    return select(sum);
  }
}

