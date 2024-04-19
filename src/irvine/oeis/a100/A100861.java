package irvine.oeis.a100;
// manually trecpas

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.DoubleRowTriangle;

/**
 * A100861 Triangle of Bessel numbers read by rows: T(n,k) is the number of k-matchings of the complete graph K(n).
 * @author Georg Fischer
 */
public class A100861 extends DoubleRowTriangle {

  /** Construct the sequence. */
  public A100861() {
    hasRAM(true);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n <= 1 ? Z.ONE : Binomial.binomial(n, 2L * k).multiply(Functions.MULTIFACTORIAL.z(2 * k - 1));
  }
}
