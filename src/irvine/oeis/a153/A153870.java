package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153870 Decimal expansion of log_18 (8).
 * @author Sean A. Irvine
 */
public class A153870 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153870() {
    super(CR.EIGHT.log().divide(CR.valueOf(18).log()));
  }
}
