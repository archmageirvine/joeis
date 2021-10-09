package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153612 Decimal expansion of log_22 (6).
 * @author Sean A. Irvine
 */
public class A153612 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153612() {
    super(CR.SIX.log().divide(CR.valueOf(22).log()));
  }
}
