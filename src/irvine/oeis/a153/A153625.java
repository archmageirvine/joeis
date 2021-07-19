package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153625 Decimal expansion of log_15 (7).
 * @author Sean A. Irvine
 */
public class A153625 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153625() {
    super(CR.SEVEN.log().divide(CR.valueOf(15).log()));
  }
}
