package irvine.oeis.a160;
// Generated by gen_seq4.pl dexcr CR.valueOf(213651).add(CR.valueOf(31850).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(457), CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A160582 Decimal expansion of (213651 +31850*sqrt(2))/457^2.
 * @author Georg Fischer
 */
public class A160582 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A160582() {
    super(CR.valueOf(213651).add(CR.valueOf(31850).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(457), CR.TWO)));
  }
}
