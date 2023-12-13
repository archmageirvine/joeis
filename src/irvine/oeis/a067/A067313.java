package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067313 Numbers k such that sigma_k(k)/k is an integer, where sigma_k(k) is the sum of the k-th powers of the divisors of k (A023887).
 * @author Sean A. Irvine
 */
public class A067313 extends Sequence1 {

  private long mN = 0;

  // Faster than fs.sigma(n).mod(n) == 0
  private boolean is(final long n) {
    Z sum = Z.ZERO;
    final Z nn = Z.valueOf(n);
    for (final Z d : Jaguar.factor(n).divisors()) {
      final Z t = d.modPow(nn, nn);
      sum = sum.add(t);
    }
    return sum.mod(n) == 0;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
