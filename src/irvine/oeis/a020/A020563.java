package irvine.oeis.a020;

import java.util.ArrayList;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.a014.A014501;

/**
 * A020563 Number of cyclic multigraphs on n labeled edges (with loops).
 * @author Sean A. Irvine
 */
public class A020563 extends A014501 {

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
