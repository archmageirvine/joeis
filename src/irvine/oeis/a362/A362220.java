package irvine.oeis.a362;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A362220 Decimal expansion of smallest positive root of x = tan(tan(x)).
 * @author Sean A. Irvine
 */
public class A362220 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A362220() {
    super(new UnaryCRFunction() {
      @Override
      public CR execute(final CR x) {
        return x.subtract(ComputableReals.SINGLETON.tan(ComputableReals.SINGLETON.tan(x)));
      }
    }.inverseMonotone(CR.valueOf(1.32), CR.valueOf(1.35)).execute(CR.ZERO));
  }
}
