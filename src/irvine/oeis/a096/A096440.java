package irvine.oeis.a096;
// Generated by gen_seq4.pl dexcr REALS.pow(REALS.pow(CR.PI, CR.THREE).subtract(REALS.pow(CR.E, CR.THREE)), CR.ONE_THIRD) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A096440 Decimal expansion of (Pi^3 - e^3)^(1/3).
 * @author Georg Fischer
 */
public class A096440 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A096440() {
    super(REALS.pow(REALS.pow(CR.PI, CR.THREE).subtract(REALS.pow(CR.E, CR.THREE)), CR.ONE_THIRD));
  }
}
