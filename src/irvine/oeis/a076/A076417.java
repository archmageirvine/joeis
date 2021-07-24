package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A076417 Decimal expansion of first solution of equation cos(x)*cosh(x) = -1.
 * @author Sean A. Irvine
 */
public class A076417 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.cos().multiply(x.cosh()).add(CR.ONE);
    }
  }

  /** Construct the sequence. */
  public A076417() {
    super(new MyFunction().inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO));
  }
}

