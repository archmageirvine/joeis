package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153124 Decimal expansion of log_20 (4).
 * @author Sean A. Irvine
 */
public class A153124 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153124() {
    super(CR.FOUR.log().divide(CR.valueOf(20).log()));
  }
}
