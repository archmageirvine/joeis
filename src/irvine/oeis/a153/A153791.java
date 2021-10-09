package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153791 Decimal expansion of log_11 (8).
 * @author Sean A. Irvine
 */
public class A153791 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153791() {
    super(CR.EIGHT.log().divide(CR.valueOf(11).log()));
  }
}
