package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-10-15.ack/sintrif at 2024-10-15 22:29

import irvine.oeis.a049.A049690;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A374263 Number of distinct primitive Pythagorean triples (j^2 - k^2, 2*j*k, j^2 + k^2) where 1 &lt;= k &lt; j &lt;= n.
 * @author Georg Fischer
 */
public class A374263 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A374263() {
    super(2, (term, n) -> term.subtract(1).divide(2), "", new A049690());
  }
}
