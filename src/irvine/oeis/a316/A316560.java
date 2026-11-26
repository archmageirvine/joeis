package irvine.oeis.a316;

import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.group.Gl2ElementOrders;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A316560 Number of cyclic subgroups of the group GL(2, Z(n)), counting conjugates as distinct.
 * @author Gregory Morse
 */
public class A316560 extends Sequence1 {

  private final Gl2ElementOrders mOrders = new Gl2ElementOrders();
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Map.Entry<Z, Z> entry : mOrders.distribution(++mN).entrySet()) {
      sum = sum.add(entry.getValue().divide(Functions.PHI.z(entry.getKey())));
    }
    return sum;
  }
}
