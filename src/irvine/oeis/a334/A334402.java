package irvine.oeis.a334;
// Generated by gen_seq4.pl decexpr at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A334402 Decimal expansion of cosh(Pi).
 * @author Georg Fischer
 */
public class A334402 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A334402() {
    super(2, REALS.cosh(CR.PI));
  }
}
