package irvine.oeis.a147;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A147868 Decimal expansion of smallest positive solution to x^8 = tan x.
 * @author Sean A. Irvine
 */
public class A147868 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.pow(8).subtract(ComputableReals.SINGLETON.tan(x));
    }
  }

  /** Construct the sequence. */
  public A147868() {
    super(new MyFunction().inverseMonotone(CR.valueOf(1.0), CR.valueOf(1.1)).execute(CR.ZERO));
  }
}
