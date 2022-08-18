package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154013 Decimal expansion of log_13 (9).
 * @author Sean A. Irvine
 */
public class A154013 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154013() {
    super(0, CR.NINE.log().divide(CR.valueOf(13).log()));
  }
}
