package irvine.oeis.a191;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A191102 Decimal expansion of (1/3)*arccos(6/Pi^2-1).
 * @author Georg Fischer
 */
public class A191102 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A191102() {
    super(0, CR.ONE_THIRD.multiply(REALS.acos(CR.SIX.divide(REALS.pow(CR.PI, CR.TWO)).subtract(CR.ONE))));
  }
}
