package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolvn at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199600 Decimal expansion of x&lt;0 satisfying x^2+2*x*cos(x)=sin(x).
 * Equation; x^2+2*x*cos(x)-sin(x)
 * @author Georg Fischer
 */
public class A199600 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199600() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().add(CR.TWO.multiply(x).multiply(x.cos())).subtract(x.sin());
      }
    }.inverseMonotone(CR.valueOf(-0.669), CR.valueOf(-0.642)).execute(CR.ZERO).negate());
  }
}
