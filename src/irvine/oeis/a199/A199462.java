package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199462 Decimal expansion of x&gt;0 satisfying x^2-2*x*sin(x)=2*cos(x).
 * Equation; x^2-2*x*sin(x)-(2*cos(x))
 * @author Georg Fischer
 */
public class A199462 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199462() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().subtract(CR.TWO.multiply(x).multiply(x.sin())).subtract(CR.TWO.multiply(x.cos()));
      }
    }.inverseMonotone(CR.valueOf(1.721), CR.valueOf(1.791)).execute(CR.ZERO));
  }
}
