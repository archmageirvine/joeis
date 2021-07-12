package irvine.oeis.a048;

import irvine.math.cr.CR;
import irvine.math.cr.MinkowskiQuestionMark;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A048819 Decimal expansion of one of four fixed points (mod 1) of Minkowski's question mark function.
 * @author Sean A. Irvine
 */
public class A048819 extends DecimalExpansionSequence {

  // todo perhaps this is not monotonic! -- it is supposedly continuous

  private static final CR N = new UnaryCRFunction() {
    @Override
    public CR execute(final CR x) {
      return new MinkowskiQuestionMark(x).subtract(x);
    }
  }.inverseMonotone(CR.valueOf("0.4203723", 10), CR.valueOf("0.4203724", 10)).execute(CR.ZERO);

  @Override
  protected CR getCR() {
    return N;
  }
}

