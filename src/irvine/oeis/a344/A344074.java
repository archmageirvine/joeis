package irvine.oeis.a344;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A344074 Decimal expansion of Bessel Y_0(1).
 * @author Sean A. Irvine
 */
public class A344074 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A344074() {
    super(0, CrFunctions.BESSEL_Y0.cr(CR.ONE));
  }
}
