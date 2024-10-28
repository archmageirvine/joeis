package irvine.oeis.a091;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A091681 Decimal expansion of BesselJ(0,2).
 * @author Sean A. Irvine
 */
public class A091681 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A091681() {
    super(0, CrFunctions.BESSEL_J0.cr(CR.TWO));
  }
}
