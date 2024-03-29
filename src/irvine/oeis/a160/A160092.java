package irvine.oeis.a160;
// Generated by gen_seq4.pl dexcr CR.valueOf(617139).add(CR.valueOf(371510).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(569), CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A160092 Decimal expansion of (617139 + 371510*sqrt(2))/569^2.
 * @author Georg Fischer
 */
public class A160092 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A160092() {
    super(CR.valueOf(617139).add(CR.valueOf(371510).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(569), CR.TWO)));
  }
}
