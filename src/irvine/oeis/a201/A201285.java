package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolvr at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201285 Decimal expansion of x satisfying x^2 + 6 = cot(x) and 0 &lt; x &lt; Pi.
 * Equation; x^2+6-cot(x)
 * @author Georg Fischer
 */
public class A201285 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A201285() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().add(CR.SIX).subtract(REALS.cot(x));
      }
    }.inverseMonotone(CR.valueOf(0.161), CR.valueOf(0.168)).execute(CR.ZERO));
  }
}
