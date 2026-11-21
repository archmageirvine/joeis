package irvine.oeis.a384;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A384117 Array read by antidiagonals: T(n,m) is the number of minimum total dominating sets in the n X m rook graph K_n X K_m.
 * @author Gregory Morse
 */
public class A384117 extends AntidiagonalSequence {
  private static Z assignments(final int m, final int n) {
    if (n > m) {
      return Z.ZERO;
    }
    if (n == 1) {
      return Binomial.binomial(m, 2);
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      final Z choose = Binomial.binomial(m, k).multiply(Binomial.binomial(n, k)).multiply(Functions.FACTORIAL.z(k));
      sum = sum.signedAdd((k & 1) == 0, choose.multiply(Z.valueOf(m - k).pow(n - k)));
    }
    return sum;
  }

  /** Construct the sequence. */
  public A384117() {
    super(0, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int m, final int n) {
        return m == 0 && n == 0 ? Z.ONE : assignments(m, n).add(assignments(n, m));
      }
    });
  }
}
