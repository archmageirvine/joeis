package irvine.oeis.a246;
// Generated by gen_seq4.pl 2024-12-04.ack/lambdan at 2024-12-04 00:03

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A246763 Catalan(n)^2 mod prime(n).
 * @author Georg Fischer
 */
public class A246763 extends LambdaSequence {

  /** Construct the sequence. */
  public A246763() {
    super(1, n -> Functions.CATALAN.z(n).square().mod(Functions.PRIME.z(n)));
  }
}
