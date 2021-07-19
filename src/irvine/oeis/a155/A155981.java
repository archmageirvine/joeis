package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155981 Decimal expansion of log_11 (24).
 * @author Sean A. Irvine
 */
public class A155981 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155981() {
    super(CR.valueOf(24).log().divide(CR.valueOf(11).log()));
  }
}
