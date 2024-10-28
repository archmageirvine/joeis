package irvine.oeis.a147;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A147865 Decimal expansion of smallest positive solution to x^5 = tan x.
 * @author Sean A. Irvine
 */
public class A147865 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCrFunction {
    @Override
    public CR execute(final CR x) {
      return x.pow(5).subtract(ComputableReals.SINGLETON.tan(x));
    }
  }

  /** Construct the sequence. */
  public A147865() {
    super(new MyFunction().inverseMonotone(CR.valueOf(1.231), CR.valueOf(1.232)).execute(CR.ZERO));
  }
}
