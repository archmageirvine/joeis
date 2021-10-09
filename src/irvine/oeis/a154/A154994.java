package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154994 Decimal expansion of log_24(18).
 * @author Sean A. Irvine
 */
public class A154994 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154994() {
    super(CR.valueOf(18).log().divide(CR.valueOf(24).log()));
  }
}
