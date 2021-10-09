package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154469 Decimal expansion of log_9 (14).
 * @author Sean A. Irvine
 */
public class A154469 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154469() {
    super(CR.valueOf(14).log().divide(CR.NINE.log()));
  }
}
