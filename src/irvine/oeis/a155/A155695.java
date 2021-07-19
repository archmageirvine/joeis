package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155695 Decimal expansion of log_4 (22).
 * @author Sean A. Irvine
 */
public class A155695 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155695() {
    super(CR.valueOf(22).log().divide(CR.FOUR.log()));
  }
}
