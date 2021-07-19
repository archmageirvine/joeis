package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155696 Decimal expansion of log_5 (22).
 * @author Sean A. Irvine
 */
public class A155696 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155696() {
    super(CR.valueOf(22).log().divide(CR.FIVE.log()));
  }
}
