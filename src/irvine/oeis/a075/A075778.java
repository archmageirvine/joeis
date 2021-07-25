package irvine.oeis.a075;
// manually (decexro at) 2021-07-25

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A075778 Decimal expansion of the real root of x^3 + x^2 - 1.
 * Polynomial: x^3+x^2-1
 * @author Georg Fischer
 */
public class A075778 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.pow(3).add(x.pow(2)).subtract(CR.ONE);
    }
  }

  /** Construct the sequence. */
  public A075778() {
    super(new MyFunction().inverseMonotone(CR.ZERO, CR.ONE).execute(CR.ZERO));
  }
}
