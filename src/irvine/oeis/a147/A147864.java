package irvine.oeis.a147;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A147864.
 * @author Sean A. Irvine
 */
public class A147864 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.pow(4).subtract(ComputableReals.SINGLETON.tan(x));
    }
  }

  /** Construct the sequence. */
  public A147864() {
    super(new MyFunction().inverseMonotone(CR.valueOf(4.710), CR.valueOf(4.711)).execute(CR.ZERO));
  }
}
