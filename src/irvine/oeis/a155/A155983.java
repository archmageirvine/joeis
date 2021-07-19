package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155983 Decimal expansion of log_13 (24).
 * @author Sean A. Irvine
 */
public class A155983 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155983() {
    super(CR.valueOf(24).log().divide(CR.valueOf(13).log()));
  }
}
