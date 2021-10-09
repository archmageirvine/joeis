package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153623 Decimal expansion of log_13 (7).
 * @author Sean A. Irvine
 */
public class A153623 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153623() {
    super(CR.SEVEN.log().divide(CR.valueOf(13).log()));
  }
}
