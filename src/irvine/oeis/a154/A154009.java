package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154009 Decimal expansion of log_6 (9).
 * @author Sean A. Irvine
 */
public class A154009 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154009() {
    super(CR.NINE.log().divide(CR.SIX.log()));
  }
}
