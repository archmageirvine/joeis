package irvine.oeis.a125;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A125578 Decimal expansion of positive root of x^2 = cos(x).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A125578 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.multiply(x).subtract(x.cos());
    }
  }

  /** Construct the sequence. */
  public A125578() {
    super(new A125578.MyFunction().inverseMonotone(CR.ZERO, CR.ONE).execute(CR.ZERO));
  }
}
