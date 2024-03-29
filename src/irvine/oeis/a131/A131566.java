package irvine.oeis.a131;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A131566 Decimal expansion of (e*Pi*phi)^2.
 * @author Georg Fischer
 */
public class A131566 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A131566() {
    super(3, REALS.pow(CR.E.multiply(CR.PI).multiply(CR.PHI), CR.TWO));
  }
}
