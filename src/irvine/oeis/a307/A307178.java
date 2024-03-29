package irvine.oeis.a307;
// Generated by gen_seq4.pl dexcr REALS.coth(CR.HALF) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A307178 Decimal expansion of coth(1/2).
 * @author Georg Fischer
 */
public class A307178 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A307178() {
    super(REALS.coth(CR.HALF));
  }
}
