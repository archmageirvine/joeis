package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155921 Decimal expansion of log_2(24) = 3+log_2(3).
 * @author Sean A. Irvine
 */
public class A155921 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155921() {
    super(CR.valueOf(24).log().divide(CR.TWO.log()));
  }
}
