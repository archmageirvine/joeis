package irvine.oeis.a346;
// Generated by gen_seq4.pl 2024-06-06/decexpr at 2024-06-06 20:10

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346205 Decimal expansion of solution to LambertW(-x) - LambertW(-1,-x) = 2.
 * Formula:
 * @author Georg Fischer
 */
public class A346205 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
  public A346205() {
    super(0, REALS.coth(CR.ONE).negate().exp().divide(REALS.sinh(CR.ONE)));
  }
}
