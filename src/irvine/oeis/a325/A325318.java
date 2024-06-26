package irvine.oeis.a325;
// Generated by gen_seq4.pl 2024-06-26/sintraf at 2024-06-26 17:12

import irvine.oeis.DirectSequence;
import irvine.oeis.a048.A048250;
import irvine.oeis.a162.A162296;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A325318 a(n) = A048250(n) AND A162296(n), where AND is the bitwise-AND, A004198.
 * @author Georg Fischer
 */
public class A325318 extends SingleTransformSequence {

  private static final DirectSequence A048250 = new A048250();

  /** Construct the sequence. */
  public A325318() {
    super(1, (term, n) -> A048250.a(n).and(term), new A162296());
  }
}
