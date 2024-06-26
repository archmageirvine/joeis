package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-06-06/decexpr at 2024-06-06 20:10

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A367959 Decimal expansion of sinh(Pi/2).
 * Formula:
 * @author Georg Fischer
 */
public class A367959 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
  public A367959() {
    super(1, CR.HALF_PI.multiply(CR.TWO.multiply(REALS.sinh(CR.PI.divide(CR.TWO))).divide(CR.PI)));
  }
}
