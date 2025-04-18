package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolvn at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199621 Decimal expansion of x&lt;0 satisfying 2*x+cos(x)=0.
 * Equation; 2*x^2+x*cos(x)
 * @author Georg Fischer
 */
public class A199621 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199621() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).add(x.multiply(x.cos()));
      }
    }.inverseMonotone(CR.valueOf(-0.459), CR.valueOf(-0.441)).execute(CR.ZERO).negate());
  }
}
