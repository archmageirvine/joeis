package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154155 Decimal expansion of log_4 (10).
 * @author Sean A. Irvine
 */
public class A154155 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154155() {
    super(CR.LOG10.divide(CR.FOUR.log()));
  }
}
