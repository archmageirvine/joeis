package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154909 Decimal expansion of log_4 (18).
 * @author Sean A. Irvine
 */
public class A154909 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154909() {
    super(CR.valueOf(18).log().divide(CR.FOUR.log()));
  }
}
