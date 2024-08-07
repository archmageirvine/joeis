package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A071759 Consider sequence b(m) = | Sum_{k=1..m} mu(k)/k |; sequence gives numerators of record low values of b(m).
 * @author Sean A. Irvine
 */
public class A071759 extends Sequence2 {

  private Q mSum = Q.ZERO;
  private Q mMin = Q.ONE;
  long mK = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(new Q(Functions.MOBIUS.l(++mK), mK));
      if (mSum.abs().compareTo(mMin) < 0) {
        mMin = mSum.abs();
        return select(mSum);
      }
    }
  }
}
