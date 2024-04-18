package irvine.oeis.a051;

import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A051625 Number of "labeled" cyclic subgroups of symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A051625 extends Sequence1 {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final CycleIndex ci = SymmetricGroup.create(++mN).cycleIndex();
    if (mN > 1) {
      mF = mF.multiply(mN);
    }
    Q sum = Q.ZERO;
    for (final MultivariateMonomial m : ci.values()) {
      Z order = Z.ONE;
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        order = order.lcm(Z.valueOf(e.getKey().right()));
      }
      sum = sum.add(m.getCoefficient().divide(Functions.PHI.z(order)));
    }
    return sum.multiply(mF).toZ();
  }
}
