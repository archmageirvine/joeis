package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085984 Decimal expansion of solution to e^x*(-1 + x) == (1 + x)/e^x.
 * @author Sean A. Irvine
 */
public class A085984 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCrFunction {
    @Override
    public CR execute(final CR x) {
      return ComputableReals.SINGLETON.tanh(x).subtract(x.inverse());
    }
  }

  /** Construct the sequence. */
  public A085984() {
    super(new MyFunction().inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO));
  }
}

