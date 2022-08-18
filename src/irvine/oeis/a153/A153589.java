package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153589 Decimal expansion of log_12 (6).
 * @author Sean A. Irvine
 */
public class A153589 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153589() {
    super(0, CR.SIX.log().divide(CR.valueOf(12).log()));
  }
}
