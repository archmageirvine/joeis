package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155529 Decimal expansion of log_17 (20).
 * @author Sean A. Irvine
 */
public class A155529 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155529() {
    super(CR.valueOf(20).log().divide(CR.valueOf(17).log()));
  }
}
