package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155183 Decimal expansion of log_4 (20).
 * @author Sean A. Irvine
 */
public class A155183 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155183() {
    super(CR.valueOf(20).log().divide(CR.FOUR.log()));
  }
}
