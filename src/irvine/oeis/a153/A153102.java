package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153102 Decimal expansion of log_6 (4).
 * @author Sean A. Irvine
 */
public class A153102 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153102() {
    super(0, CR.FOUR.log().divide(CR.SIX.log()));
  }
}
