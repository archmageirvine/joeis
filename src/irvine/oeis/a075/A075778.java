package irvine.oeis.a075;
// manually (decexro at) 2021-07-25

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A075778 Decimal expansion of the real root of x^3 + x^2 - 1.
 * Polynomial: x^3+x^2-1
 * @author Georg Fischer
 */
public class A075778 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A075778() {
    super(0, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return x.pow(3).add(x.square()).subtract(CR.ONE);
      }
    }.inverseMonotone(CR.valueOf(0.3), CR.ONE).execute(CR.ZERO));
  }
}
