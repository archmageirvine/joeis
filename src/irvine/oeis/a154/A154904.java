package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154904 Decimal expansion of log_24(17).
 * @author Sean A. Irvine
 */
public class A154904 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154904() {
    super(0, CR.valueOf(17).log().divide(CR.valueOf(24).log()));
  }
}
