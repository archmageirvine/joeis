package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155545 Decimal expansion of log_4 (21).
 * @author Sean A. Irvine
 */
public class A155545 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155545() {
    super(CR.valueOf(21).log().divide(CR.FOUR.log()));
  }
}
