package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153613 Decimal expansion of log_23 (6).
 * @author Sean A. Irvine
 */
public class A153613 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153613() {
    super(0, CR.SIX.log().divide(CR.valueOf(23).log()));
  }
}
