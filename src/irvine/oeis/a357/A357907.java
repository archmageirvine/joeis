package irvine.oeis.a357;
// Generated by gen_seq4.pl 2024-11-10.ack/lambdan at 2024-11-10 23:25

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A357907 The output of a Sinclair ZX81 random number generator.
 * @author Georg Fischer
 */
public class A357907 extends LambdaSequence {

  /** Construct the sequence. */
  public A357907() {
    super(1, n -> (Z.TWO.multiply(Z.valueOf(75).pow(n - 1)).subtract(1)).mod(Z.valueOf(65537)));
  }
}
