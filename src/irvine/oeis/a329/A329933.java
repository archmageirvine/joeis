package irvine.oeis.a329;
// Generated by gen_seq4.pl decexpr at 2021-07-13 19:14

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A329933 Decimal expansion of greatest negative number x such that csc x + sec x = 1.
 * @author Georg Fischer
 */
public class A329933 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  // x = - arcsec(1/2 (1 + sqrt(-1 + 2 sqrt(2))) + sqrt(2 (-1 + 2 sqrt(2)))))
  private static final CR SQRT6M1 = CR.EIGHT.sqrt().subtract(CR.ONE);
  private static final CR S1 = SQRT6M1.sqrt();
  private static final CR S2 = SQRT6M1.multiply(2).sqrt();

  /** Construct the sequence. */
  public A329933() {
    super(1, REALS.asec(CR.HALF.multiply(CR.ONE.add(S1).add(S2))));
  }
}
