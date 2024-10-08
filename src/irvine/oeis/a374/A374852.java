package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-08-27.ack/sintrif at 2024-08-27 22:38

import irvine.oeis.a054.A054640;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A374852 a(n) = (1/3)*A054640(n) for n &gt;= 1.
 * @author Georg Fischer
 */
public class A374852 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A374852() {
    super(1, (term, n) -> term.divide(3), "", new A054640());
  }
}
