package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153586 Decimal expansion of log_11 (6).
 * @author Sean A. Irvine
 */
public class A153586 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153586() {
    super(CR.SIX.log().divide(CR.valueOf(11).log()));
  }
}
