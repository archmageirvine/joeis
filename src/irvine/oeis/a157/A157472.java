package irvine.oeis.a157;
// Generated by gen_seq4.pl dexcr CR.valueOf(627).add(CR.valueOf(238).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(23), CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A157472 Decimal expansion of (627 + 238*sqrt(2))/23^2.
 * @author Georg Fischer
 */
public class A157472 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A157472() {
    super(CR.valueOf(627).add(CR.valueOf(238).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(23), CR.TWO)));
  }
}
