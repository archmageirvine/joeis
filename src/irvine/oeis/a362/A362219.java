package irvine.oeis.a362;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A362219 Decimal expansion of smallest positive solution to tan(x) = arctan(x).
 * @author Sean A. Irvine
 */
public class A362219 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A362219() {
    super(new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return ComputableReals.SINGLETON.tan(x).subtract(ComputableReals.SINGLETON.atan(x));
      }
    }.inverseMonotone(CR.FOUR, CR.valueOf(4.5)).execute(CR.ZERO));
  }
}
