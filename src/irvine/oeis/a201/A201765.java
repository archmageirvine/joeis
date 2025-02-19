package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolvn at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201765 Decimal expansion of the least x satisfying 9-x^2=e^x.
 * Equation; -x^2+9-exp(x)
 * @author Georg Fischer
 */
public class A201765 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201765() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().negate().add(CR.NINE).subtract(x.exp());
      }
    }.inverseMonotone(CR.valueOf(-3.051), CR.valueOf(-2.931)).execute(CR.ZERO).negate());
  }
}
