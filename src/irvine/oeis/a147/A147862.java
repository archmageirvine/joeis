package irvine.oeis.a147;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A147862 Decimal expansion of smallest positive solution to x^2 = tan x.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A147862 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.multiply(x).subtract(ComputableReals.SINGLETON.tan(x));
    }
  }

  /** Construct the sequence. */
  public A147862() {
    super(new MyFunction().inverseMonotone(CR.valueOf(4.66), CR.valueOf(4.68)).execute(CR.ZERO));
  }
}
