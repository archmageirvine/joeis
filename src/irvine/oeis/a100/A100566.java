package irvine.oeis.a100;
// Generated by gen_seq4.pl 2024-08-01.ack/lambdan at 2024-08-01 22:21

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A100566 2*a(n) = prime(prime(n)) + prime(prime(2n)).
 * @author Georg Fischer
 */
public class A100566 extends LambdaSequence {

  /** Construct the sequence. */
  public A100566() {
    super(2, n -> Functions.PRIME.z(Functions.PRIME.z(n)).add(Functions.PRIME.z(Functions.PRIME.z(2 * n))).divide(2));
  }
}
