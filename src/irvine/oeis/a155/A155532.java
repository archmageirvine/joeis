package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155532 Decimal expansion of log_21 (20).
 * @author Sean A. Irvine
 */
public class A155532 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155532() {
    super(CR.valueOf(20).log().divide(CR.valueOf(21).log()));
  }
}
