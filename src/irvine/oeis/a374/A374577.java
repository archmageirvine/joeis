package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-07-24.ack/sintrif at 2024-07-24 22:30

import irvine.oeis.DirectSequence;
import irvine.oeis.a005.A005109;
import irvine.oeis.a007.A007814;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A374577 Pierpont primes are primes of the form 2^t*3^u + 1; this sequence gives the t's in order.
 * @author Georg Fischer
 */
public class A374577 extends SingleTransformSequence {

  private static final DirectSequence A007814 = new A007814();

  /** Construct the sequence. */
  public A374577() {
    super(1, (term, n) -> A007814.a(term.subtract(1)), "", new A005109());
  }
}
