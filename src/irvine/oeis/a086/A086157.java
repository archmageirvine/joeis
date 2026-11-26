package irvine.oeis.a086;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A086157 Sum of the orders of the elements in the group GL(n,2).
 * @author Gregory Morse
 */
public class A086157 extends Sequence1 {

  private final GaloisField mField = new GaloisField(2);
  private int mN = 0;

  @Override
  public Z next() {
    final GeneralLinearGroup<Z> group = new GeneralLinearGroup<>(++mN, mField);
    Q sum = Q.ZERO;
    for (final MultivariateMonomial m : group.cycleIndex().values()) {
      Z order = Z.ONE;
      for (final Pair<String, Integer> c : m.keySet()) {
        order = order.lcm(Z.valueOf(c.right()));
      }
      sum = sum.add(m.getCoefficient().multiply(order));
    }
    return sum.multiply(group.size()).toZ();
  }
}
