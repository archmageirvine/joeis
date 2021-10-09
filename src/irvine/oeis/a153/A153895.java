package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153895 Decimal expansion of log_21 (8).
 * @author Sean A. Irvine
 */
public class A153895 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153895() {
    super(CR.EIGHT.log().divide(CR.valueOf(21).log()));
  }
}
