package irvine.oeis.a104;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A104139 Decimal expansion of log_10(9).
 * @author Sean A. Irvine
 */
public class A104139 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A104139() {
    super(0, CR.NINE.log().divide(CR.LOG10));
  }
}
