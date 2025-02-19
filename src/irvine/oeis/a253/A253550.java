package irvine.oeis.a253;
// Generated by gen_seq4.pl 2025-02-03.ack/sintrif at 2025-02-03 18:14

import irvine.oeis.DirectSequence;
import irvine.oeis.a052.A052126;
import irvine.oeis.a061.A061395;
import irvine.oeis.a065.A065091;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A253550 Shift one instance of the largest prime one step towards larger primes: a(1) = 1, for n&gt;1: a(n) = (n / prime(g)) * prime(g+1), where g = A061395(n), index of the greatest prime dividing n.
 * @author Georg Fischer
 */
public class A253550 extends SingleTransformSequence {

  private static final DirectSequence A061395 = new A061395();
  private static final DirectSequence A065091 = new A065091();

  /** Construct the sequence. */
  public A253550() {
    super(1, (term, n) -> A065091.a(A061395.a(n)).multiply(term), "1", new A052126());
  }
}
