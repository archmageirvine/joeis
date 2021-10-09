package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154010 Decimal expansion of log_8 (9).
 * @author Sean A. Irvine
 */
public class A154010 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154010() {
    super(CR.NINE.log().divide(CR.EIGHT.log()));
  }
}
