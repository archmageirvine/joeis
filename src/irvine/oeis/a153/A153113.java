package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153113 Decimal expansion of log_18 (4).
 * @author Sean A. Irvine
 */
public class A153113 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153113() {
    super(0, CR.FOUR.log().divide(CR.valueOf(18).log()));
  }
}
