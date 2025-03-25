package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A070769 Decimal expansion of Soldner's constant.
 * @author Sean A. Irvine
 */
public class A070769 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCrFunction {
    @Override
    public CR execute(final CR x) {
      return CrFunctions.LI.cr(x);
    }
  }

  /** Construct the sequence. */
  public A070769() {
    super(new MyFunction().inverseMonotone(CR.valueOf(1.4), CR.TWO).execute(CR.ZERO));
  }
}

