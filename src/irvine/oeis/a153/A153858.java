package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153858 Decimal expansion of log_17 (8).
 * @author Sean A. Irvine
 */
public class A153858 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153858() {
    super(0, CR.EIGHT.log().divide(CR.valueOf(17).log()));
  }
}
