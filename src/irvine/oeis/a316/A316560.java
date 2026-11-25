package irvine.oeis.a316;

import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A316560 Number of cyclic subgroups of GL(2,Z_n).
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
