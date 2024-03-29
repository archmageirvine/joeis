package irvine.oeis.a164;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.FOUR).divide(CR.valueOf(24)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A164108 Decimal expansion of Pi^4/24.
 * @author Georg Fischer
 */
public class A164108 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A164108() {
    super(REALS.pow(CR.PI, CR.FOUR).divide(CR.valueOf(24)));
  }
}
