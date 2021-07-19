package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155783 Decimal expansion of log_17 (22).
 * @author Sean A. Irvine
 */
public class A155783 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155783() {
    super(CR.valueOf(22).log().divide(CR.valueOf(17).log()));
  }
}
