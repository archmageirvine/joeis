package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199742 Decimal expansion of x&gt;0 satisfying 2*x^2-x*cos(x)=sin(x).
 * Equation; 2*x^2-x*cos(x)-sin(x)
 * @author Georg Fischer
 */
public class A199742 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199742() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).subtract(x.multiply(x.cos())).subtract(x.sin());
      }
    }.inverseMonotone(CR.valueOf(0.782), CR.valueOf(0.814)).execute(CR.ZERO));
  }
}
