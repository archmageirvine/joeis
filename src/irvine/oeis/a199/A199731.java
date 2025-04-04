package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolvn at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199731 Decimal expansion of least x satisfying x^2-4*x*cos(x)=4*sin(x).
 * Equation; x^2-4*x*cos(x)-4*sin(x)
 * @author Georg Fischer
 */
public class A199731 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199731() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().subtract(CR.FOUR.multiply(x).multiply(x.cos())).subtract(CR.FOUR.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(-3.878), CR.valueOf(-3.726)).execute(CR.ZERO).negate());
  }
}
