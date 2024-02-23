package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016122 Decimal expansion of solution to log_10(x) = x - 4.
 * @author Sean A. Irvine
 */
public class A016122 extends DecimalExpansionSequence {

  // Solution to log10(x) == x - 4; that is, 4.6692 ...
  // f(x) = log10(x) - x + 4

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.log10().subtract(x).add(CR.FOUR);
    }
  }

  /** Construct the sequence. */
  public A016122() {
    super(new MyFunction().inverseMonotone(CR.FOUR, CR.FIVE).execute(CR.ZERO));
  }
}

