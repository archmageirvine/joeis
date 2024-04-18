package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068885 Numerator of Sum_{k=1..n} k/phi(k).
 * @author Sean A. Irvine
 */
public class A068885 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mSum = mSum.add(new Q(++mN, Functions.PHI.l(mN)));
    return select(mSum);
  }
}
