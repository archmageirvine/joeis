package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A002033 Number of perfect partitions of n.
 * @author Sean A. Irvine
 */
public class A002033 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    } else {
      Z s = Z.ZERO;
      for (final Z d : Jaguar.factor(n).divisors()) {
        final int dd = d.intValue();
        if (dd != n) {
          s = s.add(get(dd));
        }
      }
      return s;
    }
  }
}
