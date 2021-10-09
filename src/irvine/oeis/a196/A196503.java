package irvine.oeis.a196;
// manually decsolv at 2021-08-10

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A196503 Decimal expansion of greatest x satisfying cos(x)=1/sqrt(1+x^2).
 * Equation; cos(x)-(1/sqrt(1+x^2))
 * @author Georg Fischer
 */
public class A196503 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A196503() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return x.cos().subtract(CR.ONE.divide(CR.ONE.add(x.pow(2)).sqrt()));
      }
    }.inverseMonotone(CR.valueOf(4.9), CR.valueOf(5.0)).execute(CR.ZERO).inverse());
  }
}
