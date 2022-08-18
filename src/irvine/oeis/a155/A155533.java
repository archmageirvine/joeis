package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155533 Decimal expansion of log_22 (20).
 * @author Sean A. Irvine
 */
public class A155533 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155533() {
    super(0, CR.valueOf(20).log().divide(CR.valueOf(22).log()));
  }
}
