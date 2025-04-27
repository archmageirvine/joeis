package irvine.oeis.a072;

import irvine.math.predicate.Predicates;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072980 Numerator of b(n) = Sum_{k'&lt;=n} 1/k', where k' denotes the squarefree numbers.
 * @author Sean A. Irvine
 */
public class A072980 extends Sequence1 {

  private long mN = 0;
  private Q mSum = Q.ZERO;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (Predicates.SQUARE_FREE.is(++mN)) {
      mSum = mSum.add(new Q(1, mN));
    }
    return select(mSum);
  }
}

