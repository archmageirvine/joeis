package irvine.oeis.a113;
// Generated by gen_seq4.pl decexpr at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A113816 Decimal expansion of e^(cotangent of 1 degree).
 * Formula: e^(cot(Pi/180))
 * @author Georg Fischer
 */
public class A113816 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A113816() {
    super(25, CR.E.pow(REALS.cot(CR.PI.divide(CR.valueOf(180)))));
  }
}
