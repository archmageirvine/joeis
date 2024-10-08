package irvine.oeis.a330;
// Generated by gen_seq4.pl 2024-09-12.ack/sintrif at 2024-09-12 20:55

import irvine.oeis.a019.A019434;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A330830 Numbers of the form (F_n-2)^2*F_n^2, where F_n is a Fermat prime, A019434. Also the first element of the power-spectral basis of A330829.
 * @author Georg Fischer
 */
public class A330830 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A330830() {
    super(1, (term, n) -> (term.subtract(2)).square().multiply(term.square()), "", new A019434());
  }
}
