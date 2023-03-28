package irvine.oeis.a062;

import java.util.HashSet;
import java.util.Map;

import irvine.math.group.AlternatingGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A062365.
 * @author Sean A. Irvine
 */
public class A062365 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ci = AlternatingGroup.create(++mN).cycleIndex();
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
