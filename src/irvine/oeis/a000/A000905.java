package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A000905.
 * @author Sean A. Irvine
 */
public class A000905 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.TWO;
    } else {
      Z s = Z.TWO;
      for (int k = 1; k <= n; ++k) {
        final Z b = Binomial.binomial(get(n - k), Z.valueOf(k + 1));
        s = s.signedAdd((k & 1) == 1, b);
      }
      return s;
    }
  }
}

