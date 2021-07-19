package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153754 Decimal expansion of log_6 (8).
 * @author Sean A. Irvine
 */
public class A153754 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153754() {
    super(CR.EIGHT.log().divide(CR.SIX.log()));
  }
}
