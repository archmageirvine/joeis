package irvine.oeis.a147;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A147863 Decimal expansion of smallest positive solution to x^3 = tan x.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A147863 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return ComputableReals.SINGLETON.tan(x).subtract(x.multiply(x).multiply(x));
    }
  }

  /** Construct the sequence. */
  public A147863() {
    super(new MyFunction().inverseMonotone(CR.valueOf(4.7027745370), CR.valueOf(4.7027745371)).execute(CR.ZERO));
  }
}
