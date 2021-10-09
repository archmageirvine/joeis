package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154860 Decimal expansion of log_10 (17).
 * @author Sean A. Irvine
 */
public class A154860 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154860() {
    super(CR.valueOf(17).log().divide(CR.TEN.log()));
  }
}
