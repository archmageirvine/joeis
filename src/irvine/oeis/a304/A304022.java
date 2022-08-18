package irvine.oeis.a304;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A304022 Decimal expansion of the solution to (1 - x)*(1 + x)^x = x^x.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A304022 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.add(CR.ONE).pow(x).multiply(CR.ONE.subtract(x)).subtract(x.pow(x));
    }
  }

  /** Construct the sequence. */
  public A304022() {
    super(0, new MyFunction().inverseMonotone(CR.valueOf(0.2), CR.HALF).execute(CR.ZERO));
  }
}
