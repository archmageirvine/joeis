package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154014 Decimal expansion of log_14 (9).
 * @author Sean A. Irvine
 */
public class A154014 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154014() {
    super(0, CR.NINE.log().divide(CR.valueOf(14).log()));
  }
}
