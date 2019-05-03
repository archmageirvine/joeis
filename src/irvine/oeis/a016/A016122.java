package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016122 Decimal expansion of solution to <code>log_10(x) = x - 4</code>.
 * @author Sean A. Irvine
 */
public class A016122 extends DecimalExpansionSequence {

  // Solution to log10(x) == x - 4; that is, 4.6692 ...
  // f(x) = log10(x) - x + 4

  private static final CR LOG_TEN = CR.valueOf(10).log();

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.log().divide(LOG_TEN).subtract(x).add(CR.FOUR);
    }
  }

  private static final CR N = new MyFunction().inverseMonotone(CR.FOUR, CR.FIVE).execute(CR.ZERO);

  @Override
  protected CR getCR() {
    return N;
  }
}

