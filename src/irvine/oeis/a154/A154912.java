package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154912 Decimal expansion of log_7(18).
 * @author Sean A. Irvine
 */
public class A154912 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154912() {
    super(CR.valueOf(18).log().divide(CR.SEVEN.log()));
  }
}
