package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153609 Decimal expansion of log_19 (6).
 * @author Sean A. Irvine
 */
public class A153609 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153609() {
    super(0, CR.SIX.log().divide(CR.valueOf(19).log()));
  }
}
