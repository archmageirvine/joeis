package irvine.oeis.a201;
// Generated by gen_seq4.pl 2024-06-02/lambdan at 2024-06-02 23:31

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A201125 Differences between odd powers of 2 and the next smaller square.
 * @author Georg Fischer
 */
public class A201125 extends LambdaSequence {

  /** Construct the sequence. */
  public A201125() {
    super(1, n -> Z.TWO.pow(2L * n - 1).subtract(Functions.SQRT.z(Z.TWO.pow(2L * n - 1)).square()));
  }
}
