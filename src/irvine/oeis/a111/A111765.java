package irvine.oeis.a111;
// Generated by gen_seq4.pl decexpr at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A111765 Decimal expansion of e^(-(tan 1 degree)).
 * Formula: e^(-(tan(Pi/180)))
 * @author Georg Fischer
 */
public class A111765 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A111765() {
    super(0, CR.E.pow(CR.ZERO.subtract(REALS.tan(CR.PI.divide(CR.valueOf(180))))));
  }
}
