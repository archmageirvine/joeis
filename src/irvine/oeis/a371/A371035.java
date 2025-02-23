package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-11-22.ack/lambdan at 2024-11-22 22:47

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a086.A086330;

/**
 * A371035 a(n) = A086330(prime(n)).
 * @author Georg Fischer
 */
public class A371035 extends LambdaSequence {

  private static final DirectSequence A086330 = new A086330();

  /** Construct the sequence. */
  public A371035() {
    super(1, n -> A086330.a(Functions.PRIME.z(n)));
  }
}
