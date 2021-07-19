package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154176 Decimal expansion of log_4 (11).
 * @author Sean A. Irvine
 */
public class A154176 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154176() {
    super(CR.valueOf(11).log().divide(CR.FOUR.log()));
  }
}
