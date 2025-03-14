package irvine.oeis.a104;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A104752 Decimal expansion of solution to x^(4^x) = 4.
 * Equation; x^(4^x)-(4)
 * @author Georg Fischer
 */
public class A104752 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A104752() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.pow(CR.FOUR.pow(x)).subtract(CR.FOUR);
      }
    }.inverseMonotone(CR.valueOf(1.244), CR.valueOf(1.294)).execute(CR.ZERO));
  }
}
