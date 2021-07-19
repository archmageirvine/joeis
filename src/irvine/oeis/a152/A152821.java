package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152821 Decimal expansion of log_20 (2).
 * @author Sean A. Irvine
 */
public class A152821 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152821() {
    super(CR.TWO.log().divide(CR.valueOf(20).log()));
  }
}
