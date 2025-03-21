package irvine.oeis.a104;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A104754 Decimal expansion of solution to x^(6^x) = 6.
 * Equation; x^(6^x)-(6)
 * @author Georg Fischer
 */
public class A104754 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A104754() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.pow(CR.SIX.pow(x)).subtract(CR.SIX);
      }
    }.inverseMonotone(CR.valueOf(1.198), CR.valueOf(1.246)).execute(CR.ZERO));
  }
}
