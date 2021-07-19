package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154995 Decimal expansion of log_2 (19).
 * @author Sean A. Irvine
 */
public class A154995 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154995() {
    super(CR.valueOf(19).log().divide(CR.TWO.log()));
  }
}
