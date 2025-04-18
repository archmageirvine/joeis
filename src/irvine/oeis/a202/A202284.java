package irvine.oeis.a202;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A202284 Decimal expansion of x&gt;0 satisfying x*sinh(2x)=2.
 * Equation; x*sinh(2x)-(2)
 * @author Georg Fischer
 */
public class A202284 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A202284() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.multiply(CR.TWO.multiply(x).sinh()).subtract(CR.TWO);
      }
    }.inverseMonotone(CR.valueOf(0.799), CR.valueOf(0.831)).execute(CR.ZERO));
  }
}
