package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155035 Decimal expansion of log_5 (19).
 * @author Sean A. Irvine
 */
public class A155035 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155035() {
    super(CR.valueOf(19).log().divide(CR.FIVE.log()));
  }
}
