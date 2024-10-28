package irvine.oeis.a121;
// manually decsolv at 2021-08-10

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A121967 Binary expansion of root of cos x = x.
 * Equation; cos(x)-x-2
 * @author Georg Fischer
 */
public class A121967 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A121967() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.cos().subtract(x);
      }
    }.inverseMonotone(CR.valueOf(0.73), CR.valueOf(0.74)).execute(CR.ZERO), 2);
  }
}
