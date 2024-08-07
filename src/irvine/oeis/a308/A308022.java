package irvine.oeis.a308;
// Generated by gen_seq4.pl 2024-07-24.ack/lambdan at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A308022 a(n) = prevprime(2*n-1) - nextprime(n-1), where prevprime = A151799 and nextprime = A151800.
 * @author Georg Fischer
 */
public class A308022 extends LambdaSequence {

  /** Construct the sequence. */
  public A308022() {
    super(2, n -> Functions.PREV_PRIME.z(2 * n - 1).subtract(Functions.NEXT_PRIME.z(n - 1)));
  }
}
