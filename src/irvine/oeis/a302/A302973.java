package irvine.oeis.a302;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A302973 Decimal expansion of the solution to (1 + x)*x^x = (1 - x)^x.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A302973 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.pow(x).multiply(x.add(CR.ONE)).subtract(CR.ONE.subtract(x).pow(x));
    }
  }

  /** Construct the sequence. */
  public A302973() {
    super(new MyFunction().inverseMonotone(CR.valueOf(0.2), CR.HALF).execute(CR.ZERO));
  }
}
