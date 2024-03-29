package irvine.oeis.a153;
// Generated by gen_seq4.pl decexpr at 2021-07-19 22:15

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153071 Decimal expansion of L(3, chi4), where L(s, chi4) is the Dirichlet L-function for the non-principal character modulo 4.
 * Formula: 2*atan(1)^3
 * @author Georg Fischer
 */
public class A153071 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A153071() {
    super(0, CR.TWO.multiply(REALS.atan(CR.ONE).pow(CR.THREE)));
  }
}
