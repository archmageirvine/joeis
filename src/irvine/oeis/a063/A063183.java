package irvine.oeis.a063;

import java.util.HashSet;
import java.util.Map;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A063183 Number of nonisomorphic cyclic subgroups of the group S_n X S_n (where S_n is the symmetric group of degree n).
 * @author Sean A. Irvine
 */
public class A063183 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CycleIndex ci = SymmetricGroup.create(mN).cycleIndex();
    final CycleIndex ci2 = ci.op(HararyMultiply.OP, ci);
    final HashSet<Z> orders = new HashSet<>();
    for (final MultivariateMonomial m : ci2.values()) {
      Z order = Z.ONE;
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        order = order.lcm(Z.valueOf(e.getKey().right()));
      }
      orders.add(order);
    }
    return Z.valueOf(orders.size());
  }
}
