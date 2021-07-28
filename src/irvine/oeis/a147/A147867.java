package irvine.oeis.a147;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A147867.
 * @author Sean A. Irvine
 */
public class A147867 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.pow(7).subtract(ComputableReals.SINGLETON.tan(x));
    }
  }

  /** Construct the sequence. */
  public A147867() {
    super(new MyFunction().inverseMonotone(CR.valueOf(1.1), CR.valueOf(1.2)).execute(CR.ZERO));
  }
}
