package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154858 Decimal expansion of log_8 (17).
 * @author Sean A. Irvine
 */
public class A154858 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154858() {
    super(CR.valueOf(17).log().divide(CR.EIGHT.log()));
  }
}
