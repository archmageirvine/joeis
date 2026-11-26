package irvine.oeis.a086;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A086768 Number of conjugacy classes in the group GL(3,Z_n).
 * @author Gregory Morse
 */
public class A086768 extends LambdaSequence {

  /** Construct the sequence. */
  public A086768() {
    super(1, A086768::classes);
  }

  private static Z classes(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z count = Z.ONE;
    for (final Z p : fs.toZArray()) {
      // Avni, Onn, Prasad and Vaserstein, Theorem 5.2.
      final int e = fs.getExponent(p);
      final Z local = p.pow(3L * e + 2).subtract(p.pow(3L * e)).add(p.pow(3L * e - 2).multiply2())
        .subtract(p.pow(2L * e + 1)).subtract(p.pow(2L * e - 1)).subtract(p.pow(2L * e - 2).multiply2()).add(p.pow(e - 1).multiply2())
        .divide(p.square().subtract(1));
      count = count.multiply(local);
    }
    return count;
  }
}
