package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005245 The (Mahler-Popken) complexity of n: minimal number of 1's required to build n using + and *.
 * @author Sean A. Irvine
 */
public class A005245 extends MemorySequence {

  // After Alois P. Heinz

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z min = get(n - 1).add(1);
    for (int k = 2; k <= n / 2; ++k) {
      min = min.min(get(k).add(get(n - k)));
    }
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z d : fs.divisors()) {
      final int dd = d.intValueExact();
      if (dd != 1 && dd != n) {
        min = min.min(get(dd).add(get(n / dd)));
      }
    }
    return min;
  }
}
