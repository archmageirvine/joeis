package irvine.oeis.a069;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A069995 Decimal expansion of the real positive solution to zeta(x)=x.
 * @author Sean A. Irvine
 */
public class A069995 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A069995() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return CrFunctions.ZETA.cr(x).subtract(x);
      }
    }.inverseMonotone(CR.valueOf(1.5), CR.TWO).execute(CR.ZERO));
  }
}

