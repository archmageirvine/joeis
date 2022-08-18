package irvine.oeis.a069;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A069814 Decimal expansion of root of the equation x*cosh(x)=1.
 * @author Sean A. Irvine
 */
public class A069814 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.multiply(x.cosh()).subtract(CR.ONE);
    }
  }

  /** Construct the sequence. */
  public A069814() {
    super(0, new MyFunction().inverseMonotone(CR.ZERO, CR.ONE).execute(CR.ZERO));
  }
}

