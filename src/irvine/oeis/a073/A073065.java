package irvine.oeis.a073;
// Generated by gen_seq4.pl 2024-07-24.ack/lambdan at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A073065 a(n) = prime(n) * prime(prime(n)).
 * @author Georg Fischer
 */
public class A073065 extends LambdaSequence {

  /** Construct the sequence. */
  public A073065() {
    super(1, n -> Functions.PRIME.z(n).multiply(Functions.PRIME.z(Functions.PRIME.z(n))));
  }
}
