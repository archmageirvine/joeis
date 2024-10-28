package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A072112 Decimal expansion of Hall and Tenenbaum constant.
 * @author Sean A. Irvine
 */
public class A072112 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A072112() {
    super(0, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return x.sin().add(x.cos().multiply(CR.PI.subtract(x)).subtract(CR.HALF_PI));
      }
    }.inverseMonotone(CR.ZERO, CR.TAU).execute(CR.ZERO).cos());
  }
}
