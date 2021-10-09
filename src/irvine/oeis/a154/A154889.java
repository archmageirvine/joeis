package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154889 Decimal expansion of log_14 (17).
 * @author Sean A. Irvine
 */
public class A154889 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154889() {
    super(CR.valueOf(17).log().divide(CR.valueOf(14).log()));
  }
}
