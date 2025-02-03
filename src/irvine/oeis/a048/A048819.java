package irvine.oeis.a048;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A048819 Decimal expansion of one of four fixed points (mod 1) of Minkowski's question mark function.
 * @author Sean A. Irvine
 */
public class A048819 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A048819() {
    super(0, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return CrFunctions.MINKOWSKI_QUESTION_MARK.cr(x).subtract(x);
      }
    }.inverseMonotone(CR.valueOf("0.2"), CR.valueOf("0.45")).execute(CR.ZERO));
  }
}

