package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153493 Decimal expansion of log_8 (6).
 * @author Sean A. Irvine
 */
public class A153493 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153493() {
    super(0, CR.SIX.log().divide(CR.EIGHT.log()));
  }
}
