package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A030798 Decimal expansion of the solution to <code>x^x = 2</code>.
 * @author Sean A. Irvine
 */
public class A030798 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return ComputableReals.SINGLETON.pow(x, x).subtract(CR.TWO);
    }
  }

  /** Solution to <code>x^x=2</code>. */
  public static final CR N = new MyFunction().inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO);

  @Override
  protected CR getCR() {
    return N;
  }
}

