package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A000740.
 * @author Sean A. Irvine
 */
public class A000740 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z s = Z.ONE.shiftLeft(n - 1);
    for (final Z dd : Cheetah.factor(n).divisors()) {
      final int d = dd.intValue();
      if (d != n) {
        s = s.subtract(get(d));
      }
    }
    return s;
  }
}
