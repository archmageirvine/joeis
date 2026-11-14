package irvine.oeis.a069;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A069815 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A069815() {
    super(0, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return CrFunctions.ZETA.cr(x).subtract(x.sin());
      }
    }.inverseMonotone(CR.valueOf(-0.3), CR.valueOf(-0.2)).execute(CR.ZERO).negate());
  }
}

