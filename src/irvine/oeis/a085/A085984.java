package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A085984 Decimal expansion of solution to <code>e^x*(-1 + x) == (1 + x)/e^x</code>.
 * @author Sean A. Irvine
 */
public class A085984 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return ComputableReals.SINGLETON.tanh(x).subtract(x.inverse());
    }
  }

  private static final CR N = new MyFunction().inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO);

  @Override
  protected CR getCR() {
    return N;
  }
}

