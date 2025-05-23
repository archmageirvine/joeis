package irvine.oeis.a081;
// Generated by gen_seq4.pl 2025-04-22.ack/lambdan at 2025-04-22 22:21

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A081862 (1/168)*(sigma_7(2n-1)-sigma_1(2n-1)).
 * @author Georg Fischer
 */
public class A081862 extends LambdaSequence {

  /** Construct the sequence. */
  public A081862() {
    super(1, n -> Functions.SIGMA.z(7, 2 * n - 1).subtract(Functions.SIGMA.z(1, 2 * n - 1)).divide(168));
  }
}
