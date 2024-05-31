package irvine.oeis.a020;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A020560 Number of ordered oriented multigraphs on n labeled arcs (without loops).
 * @author Sean A. Irvine
 */
public class A020560 extends A020556 {

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
