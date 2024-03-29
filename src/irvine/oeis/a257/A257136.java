package irvine.oeis.a257;
// Generated by gen_seq4.pl dexcr CR.TWO.multiply(REALS.pow(CR.PI, CR.SIX)).divide(CR.valueOf(945)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A257136 Decimal expansion of 2*Pi^6/945.
 * @author Georg Fischer
 */
public class A257136 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A257136() {
    super(CR.TWO.multiply(REALS.pow(CR.PI, CR.SIX)).divide(CR.valueOf(945)));
  }
}
