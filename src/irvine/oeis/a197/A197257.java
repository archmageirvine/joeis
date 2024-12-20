package irvine.oeis.a197;
// Generated by gen_seq4.pl decsolv at 2021-07-28 18:47

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197257 Decimal expansion of least x&gt;0 having sin(2x)=(sin 6x)^2.
 * Equation; sin(2*x)-(sin(6*x))^2
 * @author Georg Fischer
 */
public class A197257 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197257() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x).sin().subtract(CR.SIX.multiply(x).sin().pow(CR.TWO));
      }
    }.inverseMonotone(CR.valueOf(0.057), CR.valueOf(0.059)).execute(CR.ZERO));
  }
}
