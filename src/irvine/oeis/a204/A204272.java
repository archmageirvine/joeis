package irvine.oeis.a204;
// Generated by gen_seq4.pl 2024-06-14/simtraf at 2024-06-14 23:07

import irvine.math.function.Functions;
import irvine.oeis.a000.A000129;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A204272 a(n) = sigma_2(n)*Pell(n), where sigma_2(n) = A001157(n), the sum of squares of divisors of n.
 * @author Georg Fischer
 */
public class A204272 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A204272() {
    super(1, new A000129().skip(1), (n, v) -> Functions.SIGMA.z(2, n).multiply(v));
  }
}
