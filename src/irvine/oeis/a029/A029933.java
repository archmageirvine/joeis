package irvine.oeis.a029;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029933 Numerator of n * Product_{d|n} (1 + 1/d).
 * @author Sean A. Irvine
 */
public class A029933 extends Sequence1 {

  private long mN = 0;

  protected Z select(final Q prod) {
    return prod.num();
  }

  @Override
  public Z next() {
    Q prod = new Q(++mN);
    for (final Z d : Jaguar.factor(mN).divisors()) {
      prod = prod.multiply(new Q(Z.ONE, d).add(1));
    }
    return select(prod);
  }
}
