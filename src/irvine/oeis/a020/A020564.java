package irvine.oeis.a020;

import java.util.ArrayList;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.a014.A014505;

/**
 * A020564 Number of cyclic oriented multigraphs on n labeled arcs <code>(without loops)</code>.
 * @author Sean A. Irvine
 */
public class A020564 extends A014505 {

  private final ArrayList<Z> mA = new ArrayList<>();

  @Override
  public Z next() {
    final int n = mA.size();
    mA.add(super.next());
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      sum = sum.signedAdd(((n - k) & 1) == 0, mA.get(k).multiply(Stirling.firstKind(n, k)));
    }
    return sum;
  }
}
