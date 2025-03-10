package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198423 Decimal expansion of x&gt;0 having x^2-x=4*sin(x).
 * Equation; x^2-x-(4*sin(x))
 * @author Georg Fischer
 */
public class A198423 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198423() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().subtract(x).subtract(CR.FOUR.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(2.252), CR.valueOf(2.344)).execute(CR.ZERO));
  }
}
