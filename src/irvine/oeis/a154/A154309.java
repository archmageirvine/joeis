package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154309 Decimal expansion of log_8 (13).
 * @author Sean A. Irvine
 */
public class A154309 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154309() {
    super(CR.valueOf(13).log().divide(CR.EIGHT.log()));
  }
}
