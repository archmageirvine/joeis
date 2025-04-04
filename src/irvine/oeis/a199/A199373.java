package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199373 Decimal expansion of x&gt;0 satisfying x^2+2*x*sin(x)=1.
 * Equation; x^2+2*x*sin(x)-(1)
 * @author Georg Fischer
 */
public class A199373 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199373() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().add(CR.TWO.multiply(x).multiply(x.sin())).subtract(CR.ONE);
      }
    }.inverseMonotone(CR.valueOf(0.577), CR.valueOf(0.600)).execute(CR.ZERO));
  }
}
