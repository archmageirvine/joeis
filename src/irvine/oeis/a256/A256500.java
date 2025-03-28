package irvine.oeis.a256;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A256500 Decimal expansion of the positive solution to x = 2*(1-exp(-x)).
 * Equation; x-(2*(1-exp(-x)))
 * @author Georg Fischer
 */
public class A256500 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A256500() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.subtract(CR.TWO.multiply(CR.ONE.subtract(x.negate().exp())));
      }
    }.inverseMonotone(CR.valueOf(1.561), CR.valueOf(1.625)).execute(CR.ZERO));
  }
}
