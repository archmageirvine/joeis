package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388294 Decimal expansion of the unique positive x such that digamma(x) = 1/x.
 * @author Sean A. Irvine
 */
public class A388294 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388294() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return CrFunctions.DIGAMMA.cr(x).subtract(x.inverse());
      }
    }.inverseMonotone(CR.TWO, CR.THREE).execute(CR.ZERO));
  }
}
