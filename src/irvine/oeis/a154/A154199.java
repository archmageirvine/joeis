package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154199 Decimal expansion of log_6 (12).
 * @author Sean A. Irvine
 */
public class A154199 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154199() {
    super(CR.valueOf(12).log().divide(CR.SIX.log()));
  }
}
