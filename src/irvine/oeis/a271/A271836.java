package irvine.oeis.a271;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.THREE, CR.ONE_THIRD).divide(REALS.pow(CR.TWO, CR.ONE.divide(CR.SIX))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A271836 Decimal expansion of 3^(1/3) / 2^(1/6).
 * @author Georg Fischer
 */
public class A271836 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A271836() {
    super(REALS.pow(CR.THREE, CR.ONE_THIRD).divide(REALS.pow(CR.TWO, CR.ONE.divide(CR.SIX))));
  }
}
