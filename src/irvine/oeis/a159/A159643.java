package irvine.oeis.a159;
// Generated by gen_seq4.pl dexcr CR.valueOf(1084467).add(CR.valueOf(707402).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(647), CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A159643 Decimal expansion of (1084467 + 707402*sqrt(2))/647^2.
 * @author Georg Fischer
 */
public class A159643 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A159643() {
    super(CR.valueOf(1084467).add(CR.valueOf(707402).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(647), CR.TWO)));
  }
}
