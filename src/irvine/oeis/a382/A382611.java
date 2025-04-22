package irvine.oeis.a382;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A382611 Decimal expansion of the solution to x^(x/(x+1))+x-1=0.
 * @author Sean A. Irvine
 */
public class A382611 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A382611() {
    super(0, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return x.pow(x.divide(x.add(1))).add(x).subtract(1);
      }
    }.inverseMonotone(CR.ZERO, CR.HALF).execute(CR.ZERO));
  }
}

