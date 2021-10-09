package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153108 Decimal expansion of log_15 (4).
 * @author Sean A. Irvine
 */
public class A153108 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153108() {
    super(CR.FOUR.log().divide(CR.valueOf(15).log()));
  }
}
