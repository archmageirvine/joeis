package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201758 Decimal expansion of the greatest x satisfying -x^2+5=e^x.
 * Equation; -x^2+5-(e^x)
 * @author Georg Fischer
 */
public class A201758 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201758() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().negate().add(CR.FIVE).subtract(CR.E.pow(x));
      }
    }.inverseMonotone(CR.valueOf(1.216), CR.valueOf(1.266)).execute(CR.ZERO));
  }
}
