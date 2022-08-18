package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153871 Decimal expansion of log_19 (8).
 * @author Sean A. Irvine
 */
public class A153871 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153871() {
    super(0, CR.EIGHT.log().divide(CR.valueOf(19).log()));
  }
}
