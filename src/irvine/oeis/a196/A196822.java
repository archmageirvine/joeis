package irvine.oeis.a196;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A264936 Decimal expansion of the positive root of x^(x^x) = gamma.
 * @author Sean A. Irvine
 */
public class A196822 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A196822() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return x.multiply(2).subtract(x.multiply(x).add(CR.ONE).pow(2).multiply(x.sin()));
      }
    }.inverseMonotone(CR.HALF, CR.ONE).execute(CR.ZERO));
  }
}
