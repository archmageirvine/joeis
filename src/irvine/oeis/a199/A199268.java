package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199268 Decimal expansion of x &gt; 0 satisfying 2*x^2 + x*cos(x) = 3.
 * Equation; 2*x^2+x*cos(x)-3
 * @author Georg Fischer
 */
public class A199268 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199268() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).add(x.multiply(x.cos())).subtract(CR.THREE);
      }
    }.inverseMonotone(CR.valueOf(1.098), CR.valueOf(1.142)).execute(CR.ZERO));
  }
}
