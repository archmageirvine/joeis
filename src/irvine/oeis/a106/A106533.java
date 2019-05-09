package irvine.oeis.a106;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A106533 The rumor constant: decimal expansion of the number x defined by <code>x*e^(2 - 2*x) = 1</code>.
 * @author Sean A. Irvine
 */
public class A106533 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return CR.TWO.subtract(x.multiply(CR.TWO)).exp().multiply(x).subtract(CR.ONE);
    }
  }

  /** The rumour constant. */
  public static final CR RUMOUR_CONSTANT = new MyFunction().inverseMonotone(CR.ZERO, CR.HALF).execute(CR.ZERO);

  @Override
  protected CR getCR() {
    return RUMOUR_CONSTANT;
  }
}

