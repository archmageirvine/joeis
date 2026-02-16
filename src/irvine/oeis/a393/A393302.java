package irvine.oeis.a393;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002430;
import irvine.oeis.a036.A036279;

/**
 * A393302 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A393302 extends Sequence1 {

  private int mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    final Sequence cn = new A002430();
    final Sequence cd = new A036279();
    final Q q = Rationals.SINGLETON.sum(1, (mN + 1) / 2, k -> new Q(cn.next(), cd.next()).multiply(Binomial.binomial(mN, 2L * k - 2)));
    return select(q);
  }
}
