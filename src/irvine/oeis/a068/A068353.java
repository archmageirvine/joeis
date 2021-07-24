package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A068353 Decimal expansion of smallest positive root of cos(Pi x/2) cosh(Pi x/2) = -1.
 * @author Sean A. Irvine
 */
public class A068353 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.cos().multiply(x.cosh()).add(CR.ONE);
    }
  }

  /** Construct the sequence. */
  public A068353() {
    super(new MyFunction().inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO).multiply(CR.TWO).divide(CR.PI));
  }
}

