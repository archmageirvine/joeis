package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A051148 Decimal expansion of BesselK(1,2)/BesselK(0,2).
 * @author Sean A. Irvine
 */
public class A051148 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A051148() {
    super(CrFunctions.BESSEL_K.cr(1, CR.TWO).divide(CrFunctions.BESSEL_K0.cr(CR.TWO)));
  }
}
