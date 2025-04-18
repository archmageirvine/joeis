package irvine.oeis.a197;
// Generated by gen_seq4.pl decsolv at 2021-07-28 18:47

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197411 Decimal expansion of least x &gt; 0 having sin(Pi*x/4) = sin(2*x/3)^2.
 * Equation; sin(Pi/4*x)-(sin(2/3*x))^2
 * @author Georg Fischer
 */
public class A197411 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197411() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.PI.divide(CR.FOUR).multiply(x).sin().subtract(CR.TWO.divide(CR.THREE).multiply(x).sin().pow(CR.TWO));
      }
    }.inverseMonotone(CR.valueOf(2.150), CR.valueOf(2.238)).execute(CR.ZERO));
  }
}
