package irvine.oeis.a175;
// Generated by gen_seq4.pl decexpr at 2021-07-19 22:15

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A175288 Decimal expansion of the minimal positive constant x satisfying (cos(x))^2 = sin(x).
 * Formula: acot(sqrt(phi))
 * @author Georg Fischer
 */
public class A175288 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A175288() {
    super(0, REALS.acot(CR.PHI.sqrt()));
  }
}
