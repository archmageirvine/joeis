package irvine.oeis.a069;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A069286 Decimal expansion of constant rho satisfying Gaussian Phi(rho * sqrt(2)) = erf(rho) = 1/2.
 * @author Sean A. Irvine
 */
public class A069286 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCrFunction {
    @Override
    public CR execute(final CR x) {
      return x.erfc().subtract(CR.HALF);
    }
  }

  /** Construct the sequence. */
  public A069286() {
    super(0, new MyFunction().inverseMonotone(CR.ZERO, CR.ONE).execute(CR.ZERO));
  }
}

