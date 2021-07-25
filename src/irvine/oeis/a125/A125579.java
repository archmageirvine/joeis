package irvine.oeis.a125;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A125578 Decimal expansion of positive root of x^2 = cos(x).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A125579 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.multiply(x).multiply(x).subtract(x.cos());
    }
  }

  /** Construct the sequence. */
  public A125579() {
    super(new A125579.MyFunction().inverseMonotone(CR.ZERO, CR.ONE).execute(CR.ZERO));
  }
}
