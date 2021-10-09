package irvine.oeis.a048;

import irvine.math.cr.CR;
import irvine.math.cr.MinkowskiQuestionMark;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A048819 Decimal expansion of one of four fixed points (mod 1) of Minkowski's question mark function.
 * @author Sean A. Irvine
 */
public class A048819 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A048819() {
    super(0, new UnaryCRFunction() {
      @Override
      public CR execute(final CR x) {
        return new MinkowskiQuestionMark(x).subtract(x);
      }
    }.inverseMonotone(CR.valueOf("0.2"), CR.valueOf("0.45")).execute(CR.ZERO));
  }
}

