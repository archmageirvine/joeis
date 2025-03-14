package irvine.oeis.a197;
// Generated by gen_seq4.pl decsolv at 2021-08-09 22:50

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197288 Decimal expansion of least x&gt;0 having sin(5x)=(sin 7x)^2.
 * Equation; sin(5*x)-((sin(7*x))^2)
 * @author Georg Fischer
 */
public class A197288 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197288() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.FIVE.multiply(x).sin().subtract(CR.SEVEN.multiply(x).sin().square());
      }
    }.inverseMonotone(CR.valueOf(0.249), CR.valueOf(0.260)).execute(CR.ZERO));
  }
}
