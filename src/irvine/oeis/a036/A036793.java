package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A036793 Decimal expansion of (2/Pi)*Integral_{x=0..Pi} sin(x)/x dx.
 * @author Sean A. Irvine
 */
public class A036793 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A036793() {
    super(CrFunctions.SI.cr(CR.PI).multiply(2).divide(CR.PI));
  }
}
