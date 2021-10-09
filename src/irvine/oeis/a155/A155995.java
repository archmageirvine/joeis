package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155995 Decimal expansion of log_18 (24).
 * @author Sean A. Irvine
 */
public class A155995 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155995() {
    super(CR.valueOf(24).log().divide(CR.valueOf(18).log()));
  }
}
