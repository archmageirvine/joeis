package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153627 Decimal expansion of log_17 (7).
 * @author Sean A. Irvine
 */
public class A153627 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153627() {
    super(CR.SEVEN.log().divide(CR.valueOf(17).log()));
  }
}
