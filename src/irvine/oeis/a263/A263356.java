package irvine.oeis.a263;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A263356 Decimal expansion of the solution of (x-1)/(x+1) = exp(-x).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A263356 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.subtract(CR.ONE).divide(x.add(CR.ONE)).subtract(x.negate().exp());
    }
  }

  /** Construct the sequence. */
  public A263356() {
    super(new MyFunction().inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO));
  }
}
