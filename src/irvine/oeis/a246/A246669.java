package irvine.oeis.a246;
// Generated by gen_seq4.pl 2024-12-04.ack/lambdan at 2024-12-04 00:03

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A246669 Catalan(prime(n)).
 * @author Georg Fischer
 */
public class A246669 extends LambdaSequence {

  /** Construct the sequence. */
  public A246669() {
    super(1, n -> Functions.CATALAN.z(Functions.PRIME.z(n)));
  }
}
