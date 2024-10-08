package irvine.oeis.a165;
// Generated by gen_seq4.pl 2024-09-21.ack/sintrif at 2024-09-21 22:07

import irvine.math.cr.CR;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A165994 a(n) is the number of nonzero values of floor (j^2/prime(n)), over 1 &lt;= j &lt; prime(n).
 * @author Georg Fischer
 */
public class A165994 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A165994() {
    super(1, (term, n) -> CR.valueOf(term).subtract(CR.valueOf(term).sqrt()).floor(), "", new A000040());
  }
}
