package irvine.oeis.a060;
// Generated by gen_seq4.pl dexcr REALS.pow(REALS.pow(CR.PI, CR.FOUR).add(REALS.pow(CR.PI, CR.FIVE)), CR.ONE.divide(CR.SIX)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A060302 Decimal expansion of (Pi^4 + Pi^5)^(1/6).
 * @author Georg Fischer
 */
public class A060302 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A060302() {
    super(REALS.pow(REALS.pow(CR.PI, CR.FOUR).add(REALS.pow(CR.PI, CR.FIVE)), CR.ONE.divide(CR.SIX)));
  }
}
