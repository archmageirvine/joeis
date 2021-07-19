package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155693 Decimal expansion of log_2 (22).
 * @author Sean A. Irvine
 */
public class A155693 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155693() {
    super(CR.valueOf(22).log().divide(CR.TWO.log()));
  }
}
