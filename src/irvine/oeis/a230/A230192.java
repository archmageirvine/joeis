package irvine.oeis.a230;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.SIX, CR.NINE).multiply(REALS.pow(CR.TEN, CR.FIVE)).log().divide(CR.valueOf(25)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A230192 Decimal expansion of log(6^9*10^5)/25.
 * @author Georg Fischer
 */
public class A230192 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A230192() {
    super(REALS.pow(CR.SIX, CR.NINE).multiply(REALS.pow(CR.TEN, CR.FIVE)).log().divide(CR.valueOf(25)));
  }
}
