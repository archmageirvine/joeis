package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154847 Decimal expansion of log_2 (17).
 * @author Sean A. Irvine
 */
public class A154847 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154847() {
    super(CR.valueOf(17).log().divide(CR.TWO.log()));
  }
}
