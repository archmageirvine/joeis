package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154892 Decimal expansion of log_15 (17).
 * @author Sean A. Irvine
 */
public class A154892 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154892() {
    super(CR.valueOf(17).log().divide(CR.valueOf(15).log()));
  }
}
