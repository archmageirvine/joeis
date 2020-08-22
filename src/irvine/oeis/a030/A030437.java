package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A030437 Decimal expansion of x such that x^x = Pi.
 * @author Sean A. Irvine
 */
public class A030437 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.log().multiply(x).exp().subtract(CR.PI);
    }
  }

  private static final CR N = new MyFunction().inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO);

  @Override
  protected CR getCR() {
    return N;
  }
}

