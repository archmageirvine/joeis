package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153872 Decimal expansion of log_20 (8).
 * @author Sean A. Irvine
 */
public class A153872 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153872() {
    super(CR.EIGHT.log().divide(CR.valueOf(20).log()));
  }
}
