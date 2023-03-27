package irvine.oeis.a062;

import java.util.Map;

import irvine.math.group.AlternatingGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A062364 Number of cyclic subgroups of the group A_n X A_n (where A_n is the alternating group of degree n).
 * @author Sean A. Irvine
 */
public class A062364 extends Sequence1 {

  private int mN = 0;
  private Z mF2 = Z.ONE; // Order of A_n X A_n is (n!)^2/4

  @Override
  public Z next() {
    final CycleIndex ci = AlternatingGroup.create(++mN).cycleIndex();
    final CycleIndex ci2 = ci.op(HararyMultiply.OP, ci);
    if (mN > 1) {
      mF2 = mF2.multiply(mN).multiply(mN);
    }
    Q sum = Q.ZERO;
    for (final MultivariateMonomial m : ci2.values()) {
      Z order = Z.ONE;
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        order = order.lcm(Z.valueOf(e.getKey().right()));
      }
      sum = sum.add(m.getCoefficient().divide(Euler.phi(order)));
    }
    return sum.multiply(mF2).toZ().divide(4);
  }
}
