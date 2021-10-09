package irvine.oeis.a344;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A344074 Decimal expansion of Bessel Y_0(1).
 * @author Sean A. Irvine
 */
public class A344074 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A344074() {
    super(CR.ONE.besselY0());
  }
}
