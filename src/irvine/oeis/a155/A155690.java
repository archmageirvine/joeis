package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155690 Decimal expansion of log_22 (21).
 * @author Sean A. Irvine
 */
public class A155690 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155690() {
    super(0, CR.valueOf(21).log().divide(CR.valueOf(22).log()));
  }
}
