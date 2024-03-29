package irvine.oeis.a159;
// Generated by gen_seq4.pl dexcr CR.valueOf(91443).add(CR.valueOf(58282).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(199), CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A159550 Decimal expansion of (91443+58282*sqrt(2))/199^2.
 * @author Georg Fischer
 */
public class A159550 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A159550() {
    super(CR.valueOf(91443).add(CR.valueOf(58282).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(199), CR.TWO)));
  }
}
