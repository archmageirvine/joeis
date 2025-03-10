package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199441 Decimal expansion of x&gt;0 satisfying 2*x^2+2*x*sin(x)=cos(x).
 * Equation; 2*x^2+2*x*sin(x)-(cos(x))
 * @author Georg Fischer
 */
public class A199441 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199441() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).add(CR.TWO.multiply(x).multiply(x.sin())).subtract(x.cos());
      }
    }.inverseMonotone(CR.valueOf(0.466), CR.valueOf(0.485)).execute(CR.ZERO));
  }
}
