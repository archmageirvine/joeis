package irvine.oeis.a160;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A160205 Decimal expansion of (989043+524338*sqrt(2))/809^2.
 * @author Georg Fischer
 */
public class A160205 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A160205() {
    super(11, CR.valueOf(989043).add(CR.valueOf(524338).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(809), CR.TWO)));
  }
}
