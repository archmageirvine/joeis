package irvine.oeis.a244;
// Generated by gen_seq4.pl 2025-05-29.ack/lambdan at 2025-05-29 22:38

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A244513 Legendre symbol (prime(n), prime(n+1)).
 * @author Georg Fischer
 */
public class A244513 extends LambdaSequence {

  /** Construct the sequence. */
  public A244513() {
    super(1, n -> Functions.JACOBI.z(Functions.PRIME.z(n), Functions.PRIME.z(n + 1)));
  }
}
