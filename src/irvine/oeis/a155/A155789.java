package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155789 Decimal expansion of log_20 (22).
 * @author Sean A. Irvine
 */
public class A155789 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155789() {
    super(CR.valueOf(22).log().divide(CR.valueOf(20).log()));
  }
}
