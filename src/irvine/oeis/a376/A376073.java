package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-09-16.ack/sintrif at 2024-09-16 19:36

import irvine.math.function.Functions;
import irvine.oeis.a002.A002070;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A376073 Number of solutions of the congruence y^2 + y == x^3 - x^2 (mod p) as p runs through the primes.
 * @author Georg Fischer
 */
public class A376073 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A376073() {
    super(1, (term, n) -> Functions.PRIME.z(n).subtract(term), "", new A002070());
  }
}
