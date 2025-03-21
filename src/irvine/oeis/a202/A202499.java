package irvine.oeis.a202;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A202499 Decimal expansion of x satisfying x=e^(-3x).
 * Equation; x-(e^(-3x))
 * @author Georg Fischer
 */
public class A202499 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A202499() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.subtract(CR.E.pow(CR.THREE.multiply(x).negate()));
      }
    }.inverseMonotone(CR.valueOf(0.343), CR.valueOf(0.357)).execute(CR.ZERO));
  }
}
