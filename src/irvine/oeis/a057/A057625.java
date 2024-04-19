package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057625 a(n) = n! * sum 1/k! where the sum is over all positive integers k that divide n.
 * @author Sean A. Irvine
 */
public class A057625 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Q sum = Q.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(new Q(Z.ONE, Functions.FACTORIAL.z(d)));
    }
    return sum.multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
