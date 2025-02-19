package irvine.oeis.a197;
// Generated by gen_seq4.pl decsolv at 2021-07-28 18:47

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197418 Decimal expansion of least x &gt; 0 having sin(Pi*x/6) = sin(2*x/3)^2.
 * Equation; sin(Pi/6*x)-(sin(2/3*x))^2
 * @author Georg Fischer
 */
public class A197418 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197418() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.PI.divide(CR.SIX).multiply(x).sin().subtract(CR.TWO.divide(CR.THREE).multiply(x).sin().pow(CR.TWO));
      }
    }.inverseMonotone(CR.valueOf(1.465), CR.valueOf(1.525)).execute(CR.ZERO));
  }
}
