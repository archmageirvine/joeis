package irvine.oeis.a256;
// Generated by gen_seq4.pl decsolv at 2021-08-11 21:56

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A256514 Decimal expansion of the amplitude of a simple pendulum the period of which is twice the period in the small-amplitude approximation.
 * Equation; 1/agm(1,cos(x/2))-2
 * @author Georg Fischer
 */
public class A256514 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A256514() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.ONE.divide(CR.ONE.agm(x.divide(CR.TWO).cos())).subtract(CR.TWO);
      }
    }.inverseMonotone(CR.valueOf(2.732), CR.valueOf(2.844)).execute(CR.ZERO));
  }
}
