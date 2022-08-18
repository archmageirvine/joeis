package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A007524 Decimal expansion of log_10 2.
 * @author Sean A. Irvine
 */
public class A007524 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A007524() {
    super(0, CR.TWO.log().divide(CR.TEN.log()));
  }
}
