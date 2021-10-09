package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154578 Decimal expansion of log_9 (15).
 * @author Sean A. Irvine
 */
public class A154578 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154578() {
    super(CR.valueOf(15).log().divide(CR.NINE.log()));
  }
}
