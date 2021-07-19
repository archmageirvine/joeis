package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154224 Decimal expansion of log_4 (13).
 * @author Sean A. Irvine
 */
public class A154224 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154224() {
    super(CR.valueOf(13).log().divide(CR.FOUR.log()));
  }
}
