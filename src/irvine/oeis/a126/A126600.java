package irvine.oeis.a126;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A126600 Decimal expansion of solution to log(x + 1) = cos(x).
 * Polynomial: x+1
 * @author Georg Fischer
 */
public class A126600 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.add(CR.ONE).log().subtract(x.cos());
    }
  }

  /** Construct the sequence. */
  public A126600() {
    super(new MyFunction().inverseMonotone(CR.ZERO, CR.ONE).execute(CR.ZERO));
  }
}
