package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A070769 Decimal expansion of Soldner's constant.
 * @author Sean A. Irvine
 */
public class A070769 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.li();
    }
  }

  /** Construct the sequence. */
  public A070769() {
    super(new MyFunction().inverseMonotone(CR.valueOf(1.4), CR.TWO).execute(CR.ZERO));
  }
}

