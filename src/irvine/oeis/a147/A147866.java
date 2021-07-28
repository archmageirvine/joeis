package irvine.oeis.a147;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A147866 Decimal expansion of smallest positive solution to x^6 = tan x.
 * @author Sean A. Irvine
 */
public class A147866 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.pow(6).subtract(ComputableReals.SINGLETON.tan(x));
    }
  }

  /** Construct the sequence. */
  public A147866() {
    super(new MyFunction().inverseMonotone(CR.valueOf(1.13), CR.valueOf(1.14)).execute(CR.ZERO));
  }
}
