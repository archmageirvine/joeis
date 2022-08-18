package irvine.oeis.a069;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A069855 Decimal expansion of the root of x*tan(x)=1.
 * @author Sean A. Irvine
 */
public class A069855 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCRFunction {
    @Override
    public CR execute(final CR x) {
      return x.multiply(ComputableReals.SINGLETON.tan(x)).subtract(CR.ONE);
    }
  }

  /** Construct the sequence. */
  public A069855() {
    super(0, new MyFunction().inverseMonotone(CR.ZERO, CR.ONE).execute(CR.ZERO));
  }
}

