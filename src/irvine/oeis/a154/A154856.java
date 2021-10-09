package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154856 Decimal expansion of log_6 (17).
 * @author Sean A. Irvine
 */
public class A154856 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154856() {
    super(CR.valueOf(17).log().divide(CR.SIX.log()));
  }
}
