package irvine.oeis.a303;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A303069 Decimal expansion of the solution to (1 + x)*x^(1 - x) = x^x.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A303069 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.pow(CR.ONE.subtract(x)).multiply(x.add(CR.ONE)).subtract(x.pow(x));
    }
  }

  /** Construct the sequence. */
  public A303069() {
    super(new MyFunction().inverseMonotone(CR.valueOf(0.2), CR.HALF).execute(CR.ZERO));
  }
}
