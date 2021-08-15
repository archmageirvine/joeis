package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A050366 Number of ways to write n as an lterm, where an lterm is an unordered sum which is either 2, or 1 + an ordered product of lterms.
 * @author Sean A. Irvine
 */
public class A050366 extends MemorySequence {

  {
    add(Z.ONE); // 0
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(n).divisors()) {
      final int d = dd.intValue();
      if (d < n) {
        sum = sum.add(get(d).multiply(get(n / d - 1)));
      }
    }
    return sum;
  }
}
