package irvine.oeis.a086;
// Generated by gen_seq4.pl decexpr at 2021-07-19 22:15

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086726 Decimal expansion of sum(1/(6*m)^2,m=1..infinity).
 * Formula: acot(sqrt(3))^2/6
 * @author Georg Fischer
 */
public class A086726 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A086726() {
    super(0, REALS.acot(CR.THREE.sqrt()).pow(CR.TWO).divide(CR.SIX));
  }
}
