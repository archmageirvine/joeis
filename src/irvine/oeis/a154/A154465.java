package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154465 Decimal expansion of log_5 (14).
 * @author Sean A. Irvine
 */
public class A154465 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154465() {
    super(CR.valueOf(14).log().divide(CR.FIVE.log()));
  }
}
