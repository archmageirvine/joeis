package irvine.oeis.a181;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A181778 Decimal expansion of root of (x+1)^sqrt(x) = sqrt(x)^(x+1).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A181778 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCrFunction {
    @Override
    public CR execute(final CR x) {
      final CR s = x.sqrt();
      final CR x1 = x.add(CR.ONE);
      return s.pow(x1).subtract(x1.pow(s));
    }
  }

  /** Construct the sequence. */
  public A181778() {
    super(new MyFunction().inverseMonotone(CR.THREE, CR.FOUR).execute(CR.ZERO));
  }
}
