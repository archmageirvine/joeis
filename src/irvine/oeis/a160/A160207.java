package irvine.oeis.a160;
// Generated by gen_seq4.pl dex CR.valueOf(907).add(CR.valueOf(210).multiply(CR.SQRT2)).divide(CR.valueOf(857)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A160207 Decimal expansion of (907+210*sqrt(2))/857.
 * @author Georg Fischer
 */
public class A160207 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A160207() {
    super(CR.valueOf(907).add(CR.valueOf(210).multiply(CR.SQRT2)).divide(CR.valueOf(857)));
  }
}
