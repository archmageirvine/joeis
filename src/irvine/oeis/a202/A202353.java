package irvine.oeis.a202;
// manually decsolv at 2021-08-31

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A202353 Decimal expansion of the number x satisfying 2*x + 2 = exp(-x), negated.
 * Equation; 2*x+2-(exp(-x))
 * @author Georg Fischer
 */
public class A202353 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A202353() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.add(CR.ONE)).subtract(x.exp().inverse());
      }
    }.inverseMonotone(CR.valueOf(-0.316), CR.valueOf(-0.312)).execute(CR.ZERO).negate());
  }
}
