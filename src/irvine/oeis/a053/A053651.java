package irvine.oeis.a053;

import java.util.Map;
import java.util.TreeSet;

import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A053651 Number of nonisomorphic cyclic subgroups of general linear group GL(n,2).
 * @author Sean A. Irvine
 */
public class A053651 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
//    final GeneralLinearGroup<Z> g = new GeneralLinearGroup<>(++mN, new IntegersMod(2));
//    final CycleIndex ci = g.cycleIndex();
    final CycleIndex ci = new GeneralLinearCycleIndex().zykelind_glkq(++mN, 2); // todo temp
    final TreeSet<Z> orders = new TreeSet<>();
    for (final MultivariateMonomial m : ci.values()) {
      Z order = Z.ONE;
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        order = order.lcm(Z.valueOf(e.getKey().right()));
      }
      orders.add(order);
    }
    return Z.valueOf(orders.size());
  }
}
