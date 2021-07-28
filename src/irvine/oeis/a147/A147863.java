package irvine.oeis.a147;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A147863 Decimal expansion of smallest positive solution to x^3 = tan x.
 * @author Sean A. Irvine
 */
public class A147863 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.pow(3).subtract(ComputableReals.SINGLETON.tan(x));
    }
  }

  /** Construct the sequence. */
  public A147863() {
    super(new MyFunction().inverseMonotone(CR.valueOf(4.7), CR.valueOf(4.71)).execute(CR.ZERO));
  }
}
