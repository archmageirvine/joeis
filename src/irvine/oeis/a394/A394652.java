package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A394652 Decimal expansion of the real solution to x = (x-1)^(1-x), x &gt; 1.
 * @author Sean A. Irvine
 */
public class A394652 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A394652() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return x.subtract(1).pow(CR.ONE.subtract(x)).subtract(x);
      }
    }.inverseMonotone(CR.valueOf(1.1), CR.TWO).execute(CR.ZERO));
  }
}

