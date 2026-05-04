package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395598 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A395598 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395598() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return ComputableReals.SINGLETON.atan(x).multiply(2).subtract(x.multiply(x).add(1).log().divide(x)).subtract(CR.HALF_PI);
      }
    }.inverseMonotone(CR.TWO, CR.THREE).execute(CR.ZERO));
  }
}

