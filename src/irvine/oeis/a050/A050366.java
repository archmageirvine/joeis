package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A050366 Number of ways to write n as an lterm, where an lterm is an unordered sum which is either 2, or 1 + an ordered product of lterms.
 * @author Sean A. Irvine
 */
public class A050366 extends MemorySequence {

  {
    setOffset(2);
    add(Z.ONE); // 0
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      if (d < n) {
        sum = sum.add(a(d).multiply(a(n / d - 1)));
      }
    }
    return sum;
  }
}
