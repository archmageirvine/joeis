package irvine.oeis.a265;
// Generated by gen_seq4.pl 2024-07-24.ack/sintrif at 2024-07-24 22:30

import irvine.oeis.a051.A051135;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A265332 a(n) is the index of the column in A265901 where n appears; also the index of the row in A265903 where n appears.
 * @author Georg Fischer
 */
public class A265332 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A265332() {
    super(1, (term, n) -> term, "1", new A051135());
  }
}
