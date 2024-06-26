package irvine.oeis.a142;
// Generated by gen_seq4.pl trisumm/trisimple at 2023-06-09 19:35

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A142473 Triangle T(n, k) = n! * StirlingS1(n, k)/binomial(n, k), read by rows.
 * @author Georg Fischer
 */
public class A142473 extends BaseTriangle {

  /** Construct the sequence. */
  public A142473() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Functions.FACTORIAL.z(n).multiply(Functions.STIRLING1.z(n, k)).divide(Binomial.binomial(n, k));
  }
}
