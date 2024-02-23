package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154794 Decimal expansion of log_10 (16).
 * @author Sean A. Irvine
 */
public class A154794 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154794() {
    super(CR.valueOf(16).log().divide(CR.LOG10));
  }
}
