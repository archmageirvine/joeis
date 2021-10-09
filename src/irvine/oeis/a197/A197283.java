package irvine.oeis.a197;
// manually decsolv at 2021-08-31

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197283 Decimal expansion of least x&gt;0 having sin(5*x) = (sin(x))^2.
 * Equation; sin(5*x)-((sin(x))^2) = 0.569345...
 * @author Georg Fischer
 */
public class A197283 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197283() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.FIVE.multiply(x).sin().subtract(x.sin().pow(2));
      }
    }.inverseMonotone(CR.valueOf(0.567), CR.valueOf(0.571)).execute(CR.ZERO));
  }
}
