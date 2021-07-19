package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154793 Decimal expansion of log_7(16).
 * @author Sean A. Irvine
 */
public class A154793 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154793() {
    super(CR.valueOf(16).log().divide(CR.SEVEN.log()));
  }
}
