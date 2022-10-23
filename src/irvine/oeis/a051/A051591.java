package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A051591 Number of oriented triangle graphs with transitively oriented maximal cliques, on binomial(n,2) points.
 * @author Sean A. Irvine
 */
public class A051591 extends Sequence2 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 1;

  @Override
  public Z next() {
    if (++mN <= 4) {
      return mN == 4 ? Z.valueOf(18) : Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    Q sum = Q.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      sum = sum.add(new Q(d.multiply(mF.factorial(mN - 1)).pow(d), n.pow(d).multiply(mF.factorial(d))));
    }
    return sum.toZ();
  }
}

