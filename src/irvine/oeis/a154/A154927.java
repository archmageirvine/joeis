package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154927 Decimal expansion of log_8 (18).
 * @author Sean A. Irvine
 */
public class A154927 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154927() {
    super(CR.valueOf(18).log().divide(CR.EIGHT.log()));
  }
}
