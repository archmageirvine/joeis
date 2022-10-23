package irvine.oeis.a028;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028236 If n = Product (p_j^k_j), a(n) = numerator of Sum 1/p_j^k_j.
 * @author Sean A. Irvine
 */
public class A028236 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Q sum = Q.ZERO;
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z p : fs.toZArray()) {
      sum = sum.add(new Q(Z.ONE, p.pow(fs.getExponent(p))));
    }
    return sum.num();
  }
}
