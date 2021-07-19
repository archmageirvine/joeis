package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154116 Decimal expansion of log_24(9).
 * @author Sean A. Irvine
 */
public class A154116 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154116() {
    super(CR.NINE.log().divide(CR.valueOf(24).log()));
  }
}
