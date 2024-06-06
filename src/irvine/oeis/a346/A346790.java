package irvine.oeis.a346;
// manually 2024-06-04/decexp at 2024-06-06 14:18

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346790 Decimal expansion of the cotangent of an arcsecond.
 * Formula:
 * @author Georg Fischer
 */
public class A346790 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
  public A346790() {
    super(6, REALS.cot(CR.PI.divide(CR.valueOf(180L * 3600L))));
  }
}
