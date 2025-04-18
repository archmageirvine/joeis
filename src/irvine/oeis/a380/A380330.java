package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-01-31.ack/lambdan at 2025-01-31 23:19

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A380330 a(n) = A151800(prime(n)*A151800(n)).
 * @author Georg Fischer
 */
public class A380330 extends LambdaSequence {

  /** Construct the sequence. */
  public A380330() {
    super(1, n -> Functions.NEXT_PRIME.z(Functions.PRIME.z(n).multiply(Functions.NEXT_PRIME.z(n))));
  }
}
