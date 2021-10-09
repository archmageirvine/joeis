package irvine.oeis.a199;
// manually decsolv at 2021-09-09

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199597 Decimal expansion of x &gt; 0 satisfying x^2 + x*cos(x) = sin(x).
 * Equation; x^2+x*cos(x)-2*sin(x)
 * @author Georg Fischer
 */
public class A199597 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199597() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return x.pow(2).add(x.multiply(x.cos())).subtract(CR.TWO.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(1.18), CR.valueOf(1.19)).execute(CR.ZERO));
  }
}
