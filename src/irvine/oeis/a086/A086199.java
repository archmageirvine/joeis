package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A093341.
 * @author Sean A. Irvine
 */
public class A086199 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A086199() {
    super(0, new UnaryCRFunction() {
      @Override
      public CR execute(final CR x) {
        return x.ellipticK().subtract(x.ellipticE().multiply(2));
      }
    }.inverseMonotone(CR.HALF, CR.valueOf(0.99)).execute(CR.ZERO));
  }
}
