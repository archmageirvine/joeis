package irvine.oeis.a197;
// Generated by gen_seq4.pl decsolv at 2021-07-28 18:47

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197517 Decimal expansion of least x&gt;0 having cos(Pi*x)=(cos x/2)^2.
 * Equation; cos(Pi*x)-(cos(1/2*x))^2
 * @author Georg Fischer
 */
public class A197517 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197517() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.PI.multiply(x).cos().subtract(CR.ONE.divide(CR.TWO).multiply(x).cos().pow(CR.TWO));
      }
    }.inverseMonotone(CR.valueOf(1.618), CR.valueOf(1.684)).execute(CR.ZERO));
  }
}
