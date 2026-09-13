package irvine.oeis.a283;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A283626 Number of integer triples (x,y,z), x &gt; 0, y &gt; 0, z &gt; 0, such that x &lt;= p, y &lt;= q, z &lt;= r for any factorization n = p*q*r.
 * @author Sean A. Irvine
 */
public class A283626 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long[][] h = new long[mN][mN];
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      for (final Z ee : Jaguar.factor(mN / d).divisors()) {
        final int e = ee.intValue();
        for (int x = 0; x < d; ++x) {
          for (int y = 0; y < e; ++y) {
            h[x][y] = Math.max(h[x][y], mN / d / e);
          }
        }
      }
    }
    Z sum = Z.ZERO;
    for (final long[] r : h) {
      sum = sum.add(Functions.SUM.l(r));
    }
    return sum;
  }
}
