package irvine.oeis.a197;
// Generated by gen_seq4.pl decsolv at 2021-08-09 22:50

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197282 Decimal expansion of least x&gt;0 having sin(4x)=(sin 8x)^2.
 * Equation; sin(4*x)-((sin(8*x))^2)
 * @author Georg Fischer
 */
public class A197282 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197282() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.FOUR.multiply(x).sin().subtract(CR.EIGHT.multiply(x).sin().square());
      }
    }.inverseMonotone(CR.valueOf(0.243), CR.valueOf(0.253)).execute(CR.ZERO));
  }
}
