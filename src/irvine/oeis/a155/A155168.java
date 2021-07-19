package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155168 Decimal expansion of log_24(19).
 * @author Sean A. Irvine
 */
public class A155168 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155168() {
    super(CR.valueOf(19).log().divide(CR.valueOf(24).log()));
  }
}
