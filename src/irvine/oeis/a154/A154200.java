package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154200 Decimal expansion of log_7(12).
 * @author Sean A. Irvine
 */
public class A154200 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154200() {
    super(CR.valueOf(12).log().divide(CR.SEVEN.log()));
  }
}
