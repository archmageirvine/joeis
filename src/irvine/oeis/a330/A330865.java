package irvine.oeis.a330;
// Generated by gen_seq4.pl decexpr at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A330865 Decimal expansion of cosh(Pi/2)/Pi.
 * @author Georg Fischer
 */
public class A330865 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A330865() {
    super(0, REALS.cosh(CR.PI.divide(CR.TWO)).divide(CR.PI));
  }
}
