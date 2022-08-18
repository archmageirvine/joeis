package irvine.oeis.a038;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A038458 Decimal expansion of the solution to 127^x - 113^x = 1. This is the smallest x such that q^x - p^x = 1 for two successive primes p, q.
 * @author Sean A. Irvine
 */
public class A038458 extends DecimalExpansionSequence {

  private static final CR C1 = CR.valueOf(127).log();
  private static final CR C2 = CR.valueOf(113).log();

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return C1.multiply(x).exp().subtract(C2.multiply(x).exp()).subtract(CR.ONE);
    }
  }

  /** Construct the sequence. */
  public A038458() {
    super(0, new MyFunction().inverseMonotone(CR.HALF, CR.ONE).execute(CR.ZERO));
  }
}

