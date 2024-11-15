package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073084 Decimal expansion of -x, where x is the negative solution to the equation 2^x = x^2.
 * @author Sean A. Irvine
 */
public class A073084 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A073084() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().subtract(CR.TWO.pow(x));
      }
    }.inverseMonotone(CR.NEG_ONE, CR.ZERO).execute(CR.ZERO).negate());
  }
}
