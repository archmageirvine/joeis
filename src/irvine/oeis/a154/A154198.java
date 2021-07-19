package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154198 Decimal expansion of log_5 (12).
 * @author Sean A. Irvine
 */
public class A154198 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154198() {
    super(CR.valueOf(12).log().divide(CR.FIVE.log()));
  }
}
