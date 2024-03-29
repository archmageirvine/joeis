package irvine.oeis.a160;
// Generated by gen_seq4.pl dexcr CR.valueOf(8979).add(CR.valueOf(2990).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(89), CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A160057 Decimal expansion of (8979+2990*sqrt(2))/89^2.
 * @author Georg Fischer
 */
public class A160057 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A160057() {
    super(CR.valueOf(8979).add(CR.valueOf(2990).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(89), CR.TWO)));
  }
}
