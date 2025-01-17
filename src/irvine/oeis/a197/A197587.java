package irvine.oeis.a197;
// Generated by gen_seq4.pl decsolv at 2021-07-28 18:47

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197587 Decimal expansion of least x &gt; 0 having cos(4*Pi*x) = cos(x)^2.
 * Equation; sin(4*Pi*x)-(sin(x))^2
 * @author Georg Fischer
 */
public class A197587 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197587() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.FOUR.multiply(CR.PI).multiply(x).sin().subtract(x.sin().pow(CR.TWO));
      }
    }.inverseMonotone(CR.valueOf(0.240), CR.valueOf(0.250)).execute(CR.ZERO));
  }
}
