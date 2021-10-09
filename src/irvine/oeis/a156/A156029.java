package irvine.oeis.a156;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A156029 Decimal expansion of log_22 (24).
 * @author Sean A. Irvine
 */
public class A156029 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A156029() {
    super(CR.valueOf(24).log().divide(CR.valueOf(22).log()));
  }
}
