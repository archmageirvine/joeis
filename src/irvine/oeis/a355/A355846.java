package irvine.oeis.a355;
// Generated by gen_seq4.pl 2025-04-04.ack/multraf at 2025-04-04 23:53

import irvine.oeis.a066.A066653;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A355846 a(n) = A066653(n+1)/3.
 * @author Georg Fischer
 */
public class A355846 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A355846() {
    super(1, (self, n) -> self.s(0).divide(3), "", new A066653().skip(1));
  }
}
