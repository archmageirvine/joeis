package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-08-09 22:50

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198816 Decimal expansion of x&gt;0 satisfying x^2-cos(x)=1.
 * Equation; x^2-cos(x)-(1)
 * @author Georg Fischer
 */
public class A198816 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198816() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().subtract(x.cos()).subtract(CR.ONE);
      }
    }.inverseMonotone(CR.valueOf(1.152), CR.valueOf(1.200)).execute(CR.ZERO));
  }
}
