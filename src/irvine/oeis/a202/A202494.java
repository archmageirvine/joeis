package irvine.oeis.a202;
// manually decsolv at 2021-08-31

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A202494 Decimal expansion of x satisfying x=e^(x-3).
 * Equation; x-(e^(x-2))
 * @author Georg Fischer
 */
public class A202494 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A202494() {
    super(-1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return x.subtract(CR.E.pow(x.subtract(CR.THREE)));
      }
    }.inverseMonotone(CR.valueOf(0.0522), CR.valueOf(0.0526)).execute(CR.ZERO));
    // next();
  }
}
