package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolvr at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200642 Decimal expansion of least x&gt;0 satisfying 4*x^2+5=tan(x).
 * Equation; 4*x^2+5-(tan(x))
 * @author Georg Fischer
 */
public class A200642 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A200642() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.FOUR.multiply(x.square()).add(CR.FIVE).subtract(REALS.tan(x));
      }
    }.inverseMonotone(CR.valueOf(1.469), CR.valueOf(1.529)).execute(CR.ZERO));
  }
}
