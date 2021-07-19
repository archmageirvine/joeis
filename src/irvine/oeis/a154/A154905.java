package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154905 Decimal expansion of log_2 (18).
 * @author Sean A. Irvine
 */
public class A154905 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154905() {
    super(CR.valueOf(18).log().divide(CR.TWO.log()));
  }
}
