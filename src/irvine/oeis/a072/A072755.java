package irvine.oeis.a072;

import irvine.oeis.a033.A033308;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A072555.
 * @author Sean A. Irvine
 */
public class A072755 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A072755() {
    super(0, DecimalExpansionSequence.create(new A033308()));
  }
}
