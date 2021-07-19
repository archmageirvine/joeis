package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154707 Decimal expansion of log_21 (15).
 * @author Sean A. Irvine
 */
public class A154707 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154707() {
    super(CR.valueOf(15).log().divide(CR.valueOf(21).log()));
  }
}
