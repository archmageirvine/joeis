package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154102 Decimal expansion of log_23 (9).
 * @author Sean A. Irvine
 */
public class A154102 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154102() {
    super(CR.NINE.log().divide(CR.valueOf(23).log()));
  }
}
