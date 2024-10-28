package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086199 Decimal expansion of value of x such that K(x) = 2E(x).
 * @author Sean A. Irvine
 */
public class A086199 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A086199() {
    super(0, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return CrFunctions.ELLIPTIC_K.cr(x).subtract(CrFunctions.ELLIPTIC_E.cr(x).multiply(2));
      }
    }.inverseMonotone(CR.HALF, CR.valueOf(0.99)).execute(CR.ZERO));
  }
}
