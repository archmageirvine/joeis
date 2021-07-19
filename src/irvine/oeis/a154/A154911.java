package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154911 Decimal expansion of log_6 (18).
 * @author Sean A. Irvine
 */
public class A154911 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154911() {
    super(CR.valueOf(18).log().divide(CR.SIX.log()));
  }
}
