package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198555 Decimal expansion of x&gt;0 having 4*x^2-x=2*sin(x).
 * Equation; 4*x^2-x-(2*sin(x))
 * @author Georg Fischer
 */
public class A198555 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198555() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.FOUR.multiply(x.square()).subtract(x).subtract(CR.TWO.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(0.695), CR.valueOf(0.723)).execute(CR.ZERO));
  }
}
