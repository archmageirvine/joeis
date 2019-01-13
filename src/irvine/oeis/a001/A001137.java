package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A001137.
 * @author Sean A. Irvine
 */
public class A001137 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    switch (n) {
    case 0:
      add(Z.ZERO);
      add(Z.ONE);
      return Z.ONE;
    default:
      Z t = Z.ZERO;
      for (int m = (n + 3) / 4; m <= n / 2; ++m) {
        t = t.add(Binomial.binomial(2 * m, n - 2 * m).multiply(get(m)));
      }
      return t;
    }
  }
}

