package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A030178 Decimal expansion of LambertW(1): the solution to x*exp(x) = 1.
 * @author Sean A. Irvine
 */
public class A030178 extends DecimalExpansionSequence {

  // Solution to x * exp(x) = 1, LambertW(1); that is, 0.56714...
  // f(x) = x * exp(x) - 1

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.exp().multiply(x).subtract(CR.ONE);
    }
  }

  /** Construct the sequence. */
  public A030178() {
    super(0, new MyFunction().inverseMonotone(CR.ZERO, CR.ONE).execute(CR.ZERO));
  }
}

