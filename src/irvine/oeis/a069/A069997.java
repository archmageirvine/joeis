package irvine.oeis.a069;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A069997 Decimal expansion of (negative of) root of exp(x)+sin(x)=0.
 * @author Sean A. Irvine
 */
public class A069997 extends DecimalExpansionSequence {

  private static class MyFunction extends UnaryCrFunction {
    @Override
    public CR execute(final CR x) {
      final CR nx = x.negate();
      return nx.exp().add(nx.sin());
    }
  }

  /** Construct the sequence. */
  public A069997() {
    super(0, new MyFunction().inverseMonotone(CR.ZERO, CR.ONE).execute(CR.ZERO));
  }
}

