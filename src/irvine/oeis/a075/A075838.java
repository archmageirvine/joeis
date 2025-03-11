package irvine.oeis.a075;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A075838 Decimal expansion of the solution to the donkey problem.
 * @author Sean A. Irvine
 */
public class A075838 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A075838() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        final CR x2 = x.multiply(2);
        return CR.HALF_PI.add(x.cos().square().multiply(x).multiply(4).subtract(x2).subtract(x2.sin()));
      }
    }.inverseMonotone(CR.ZERO, CR.ONE).execute(CR.ZERO));
  }
}
