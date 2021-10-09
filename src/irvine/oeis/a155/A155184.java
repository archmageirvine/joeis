package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155184 Decimal expansion of log_5 (20).
 * @author Sean A. Irvine
 */
public class A155184 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155184() {
    super(CR.valueOf(20).log().divide(CR.FIVE.log()));
  }
}
