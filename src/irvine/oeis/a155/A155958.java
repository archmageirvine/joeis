package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155958 Decimal expansion of log_5 (24).
 * @author Sean A. Irvine
 */
public class A155958 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155958() {
    super(CR.valueOf(24).log().divide(CR.FIVE.log()));
  }
}
