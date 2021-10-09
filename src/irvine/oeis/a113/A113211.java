package irvine.oeis.a113;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A113211 Decimal expansion of (2 * log(3))/log(7).
 * @author Sean A. Irvine
 */
public class A113211 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A113211() {
    super(CR.NINE.log().divide(CR.SEVEN.log()));
  }
}
