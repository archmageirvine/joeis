package irvine.oeis.a020;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A020559 Number of ordered multigraphs on n labeled edges (with loops).
 * @author Sean A. Irvine
 */
public class A020559 extends A020555 {

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
