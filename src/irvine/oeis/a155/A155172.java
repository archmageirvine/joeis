package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155172 Decimal expansion of log_2 (20).
 * @author Sean A. Irvine
 */
public class A155172 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155172() {
    super(CR.valueOf(20).log().divide(CR.TWO.log()));
  }
}
