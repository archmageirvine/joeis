package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085085 Numerator of Sum_{i=2..t} (d(i)/d(i-1)-1), where d(1), ..., d(t) are the divisors of n.
 * @author Sean A. Irvine
 */
public class A085085 extends Sequence1 {

  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    Q sum = Q.ZERO;
    Z f = null;
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      if (f != null) {
        sum = sum.add(new Q(d.subtract(f), f));
      }
      f = d;
    }
    return select(sum);
  }
}
