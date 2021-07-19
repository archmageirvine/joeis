package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154884 Decimal expansion of log_12 (17).
 * @author Sean A. Irvine
 */
public class A154884 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154884() {
    super(CR.valueOf(17).log().divide(CR.valueOf(12).log()));
  }
}
