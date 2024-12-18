package irvine.oeis.a197;
// Generated by gen_seq4.pl decsolv at 2021-07-28 18:47

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197478 Decimal expansion of least x&gt;0 having cos(x)=(cos 4x)^2.
 * Equation; cos(x)-(cos(4*x))^2
 * @author Georg Fischer
 */
public class A197478 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197478() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.cos().subtract(CR.FOUR.multiply(x).cos().pow(CR.TWO));
      }
    }.inverseMonotone(CR.valueOf(0.652), CR.valueOf(0.679)).execute(CR.ZERO));
  }
}
