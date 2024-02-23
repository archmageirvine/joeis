package irvine.oeis.a053;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A053511 Decimal expansion of log_10 (Pi).
 * @author Sean A. Irvine
 */
public class A053511 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A053511() {
    super(0, CR.PI.log().divide(CR.LOG10));
  }
}
