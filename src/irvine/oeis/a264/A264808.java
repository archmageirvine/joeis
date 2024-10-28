package irvine.oeis.a264;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A264808 Decimal expansion of the positive root of x^(x^x) = e.
 * @author Sean A. Irvine
 */
public class A264808 extends DecimalExpansionSequence {

  // Solution to x^(x^x) = e (example of root finding)

  private static class MyFunction extends UnaryCrFunction {
    @Override
    public CR execute(final CR x) {
      final CR xx = ComputableReals.SINGLETON.pow(x, x);
      return ComputableReals.SINGLETON.pow(x, xx).subtract(CR.E);
    }
  }

  /** Construct the sequence. */
  public A264808() {
    super(new MyFunction().inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO));
  }
}

