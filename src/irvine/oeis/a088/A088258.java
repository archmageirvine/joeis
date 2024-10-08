package irvine.oeis.a088;
// Generated by gen_seq4.pl 2024-08-09.ack/sintrif at 2024-08-10 19:00

import irvine.math.function.Functions;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A088258 Factorials F which have at least one prime neighbor, i.e., F+1 or F-1 or both are primes.
 * @author Georg Fischer
 */
public class A088258 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A088258() {
    super(1, (term, n) -> Functions.FACTORIAL.z(term), "", new A088412());
  }
}
