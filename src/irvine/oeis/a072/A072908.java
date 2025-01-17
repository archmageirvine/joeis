package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A072908 Decimal expansion of the solution of equation log(2)-X*2^(-r)-exp(-X*r/(2^r-1)) = 0 for r = 4 . Solution is 9.96955802...
 * Equation; log(2)-x/16-1/exp(x*4/15)
 * @author Georg Fischer
 */
public class A072908 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A072908() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.log().subtract(x.divide(16)).subtract(CR.ONE.divide(x.multiply(4).divide(15).exp()));
      }
    }.inverseMonotone(CR.valueOf(9.770), CR.valueOf(10.168)).execute(CR.ZERO));
  }
}
