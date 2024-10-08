package irvine.oeis.a215;
// Generated by gen_seq4.pl 2024-01-04/cofrden at 2024-01-05 23:45

import irvine.oeis.a154.A154182;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;

/**
 * A215756 Denominators of the continued fraction convergents of log_10(11).
 * @author Georg Fischer
 */
public class A215756 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence */
  public A215756() {
    super(0, new A154182());
  }
}
