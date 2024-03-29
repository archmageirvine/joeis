package irvine.oeis.a343;
// Generated by gen_seq4.pl decexpr at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A343058 Decimal expansion of tan(Pi/7).
 * @author Georg Fischer
 */
public class A343058 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A343058() {
    super(0, REALS.tan(CR.PI.divide(CR.SEVEN)));
  }
}
