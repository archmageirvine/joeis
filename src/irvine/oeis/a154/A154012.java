package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154012 Decimal expansion of log_12 (9).
 * @author Sean A. Irvine
 */
public class A154012 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154012() {
    super(0, CR.NINE.log().divide(CR.valueOf(12).log()));
  }
}
