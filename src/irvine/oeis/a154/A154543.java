package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154543 Decimal expansion of log_4 (15).
 * @author Sean A. Irvine
 */
public class A154543 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154543() {
    super(CR.valueOf(15).log().divide(CR.FOUR.log()));
  }
}
