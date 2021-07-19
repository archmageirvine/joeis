package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153603 Decimal expansion of log_13 (6).
 * @author Sean A. Irvine
 */
public class A153603 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153603() {
    super(CR.SIX.log().divide(CR.valueOf(13).log()));
  }
}
