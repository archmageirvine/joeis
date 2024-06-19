package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070888 Numerator of Sum_{k=1..n} mu(k)/k.
 * @author Sean A. Irvine
 */
public class A070888 extends Sequence1 {

  protected Q mSum = Q.ZERO;
  protected long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Functions.MOBIUS.l(++mN), mN));
    return select(mSum);
  }
}
