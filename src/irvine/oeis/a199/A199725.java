package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199725 Decimal expansion of x&gt;0 satisfying x^2-2*x*cos(x)=2*sin(x).
 * Equation; x^2-2*x*cos(x)-(2*sin(x))
 * @author Georg Fischer
 */
public class A199725 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199725() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().subtract(CR.TWO.multiply(x).multiply(x.cos())).subtract(CR.TWO.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(1.462), CR.valueOf(1.522)).execute(CR.ZERO));
  }
}
