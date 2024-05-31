package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a001.A001035;

/**
 * A006905 Number of transitive relations on n labeled nodes.
 * @author Sean A. Irvine
 */
public class A006905 extends A001035 {

  private final ArrayList<Z> mA = new ArrayList<>();

  @Override
  public Z next() {
    final int n = mA.size();
    mA.add(super.next());
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      Z t = Z.ZERO;
      for (int s = 0; s <= k; ++s) {
        t = t.add(Binomial.binomial(n, s).multiply(Functions.STIRLING2.z(n - s, k - s)));
      }
      sum = sum.add(t.multiply(mA.get(k)));
    }
    return sum;
  }
}
