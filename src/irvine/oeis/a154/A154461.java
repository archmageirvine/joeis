package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154461 Decimal expansion of log_24(13).
 * @author Sean A. Irvine
 */
public class A154461 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154461() {
    super(CR.valueOf(13).log().divide(CR.valueOf(24).log()));
  }
}
