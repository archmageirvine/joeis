package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154581 Decimal expansion of log_11 (15).
 * @author Sean A. Irvine
 */
public class A154581 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154581() {
    super(CR.valueOf(15).log().divide(CR.valueOf(11).log()));
  }
}
