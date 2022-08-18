package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154011 Decimal expansion of log_11 (9).
 * @author Sean A. Irvine
 */
public class A154011 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154011() {
    super(0, CR.NINE.log().divide(CR.valueOf(11).log()));
  }
}
