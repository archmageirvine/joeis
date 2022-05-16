package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A081720 Triangle T(n,k) read by rows, giving number of bracelets (turnover necklaces) with n beads of k colors (n &gt;= 1, 1 &lt;= k &lt;= n).
 * Adapted from Maple.
 * @author Georg Fischer
 */
public class A081720 extends Triangle {

  /* Caution, this method is used in A276550! */
  @Override
  public Z compute(int n, int k) {
    ++n; // offset 1, 1
    ++k;
    Z sum = Z.ZERO;
    final Z zk = Z.valueOf(k);
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(Euler.phi(d).multiply(zk.pow(n / d.intValue())));
    }
    if ((n & 1) == 0) {
      sum = sum.add(zk.add(1).multiply(zk.pow(n / 2)).multiply(n / 2));
    } else {
      sum = sum.add(Z.valueOf(n).multiply(zk.pow((n + 1) / 2)));
    }
    return sum.divide(2L * n);
  }
}
