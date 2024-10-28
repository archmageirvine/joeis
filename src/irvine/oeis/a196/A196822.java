package irvine.oeis.a196;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A196822 Decimal expansion of the number x satisfying 2*x = ((1+x^2)^2)*sin(x) and 0 &lt; x &lt; 2*Pi.
 * @author Sean A. Irvine
 */
public class A196822 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A196822() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.multiply(2).subtract(x.multiply(x).add(CR.ONE).square().multiply(x.sin()));
      }
    }.inverseMonotone(CR.HALF, CR.ONE).execute(CR.ZERO));
  }
}
