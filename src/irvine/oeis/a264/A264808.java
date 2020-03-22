package irvine.oeis.a264;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A264808 Decimal expansion of the positive root of <code>x^(x^x) =</code> e.
 * @author Sean A. Irvine
 */
public class A264808 extends DecimalExpansionSequence {

  // Solution to x^(x^x) = e

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      final CR xx = ComputableReals.SINGLETON.pow(x, x);
      return ComputableReals.SINGLETON.pow(x, xx).subtract(CR.E);
    }
  }

  private static final CR N = new MyFunction().inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO);

  @Override
  protected CR getCR() {
    return N;
  }
}

