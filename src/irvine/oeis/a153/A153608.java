package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153608 Decimal expansion of log_18 (6).
 * @author Sean A. Irvine
 */
public class A153608 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153608() {
    super(CR.SIX.log().divide(CR.valueOf(18).log()));
  }
}
