package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A001138 Red rooted red-black trees with n internal nodes.
 * @author Sean A. Irvine
 */
public class A001138 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    switch (n) {
    case 0:
      add(Z.ZERO);
      add(Z.ZERO);
      return Z.ONE;
    case 3:
      return Z.ZERO;
    case 4:
      return Z.ONE;
    default:
      Z t = Z.ZERO;
      for (int m = (n + 3) / 4; m <= n / 2; ++m) {
        t = t.add(Binomial.binomial(2L * m, n - 2L * m).multiply(a(m)));
      }
      return t;
    }
  }
}

