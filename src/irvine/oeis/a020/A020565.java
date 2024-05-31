package irvine.oeis.a020;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014507;

/**
 * A020565 Number of cyclic oriented multigraphs on n labeled arcs (with loops).
 * @author Sean A. Irvine
 */
public class A020565 extends A014507 {

  private final ArrayList<Z> mA = new ArrayList<>();

  @Override
  public Z next() {
    final int n = mA.size();
    mA.add(super.next());
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      sum = sum.signedAdd(((n - k) & 1) == 0, mA.get(k).multiply(Functions.STIRLING1.z(n, k)));
    }
    return sum;
  }
}
