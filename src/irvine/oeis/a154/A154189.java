package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154189 Decimal expansion of log_18 (11).
 * @author Sean A. Irvine
 */
public class A154189 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154189() {
    super(CR.valueOf(11).log().divide(CR.valueOf(18).log()));
  }
}
