package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

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

  /** Construct the sequence. */
  public A030437() {
    super(new MyFunction().inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO));
  }
}

