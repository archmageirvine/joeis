package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199612 Decimal expansion of greatest x satisfying x + 4*cos(x) = 0.
 * Equation; x^2+4*x*cos(x)
 * @author Georg Fischer
 */
public class A199612 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199612() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().add(CR.FOUR.multiply(x).multiply(x.cos()));
      }
    }.inverseMonotone(CR.valueOf(3.523), CR.valueOf(3.667)).execute(CR.ZERO));
  }
}
