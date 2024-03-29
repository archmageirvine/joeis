package irvine.oeis.a094;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A094141 Decimal expansion of (e/Pi)^(1/10).
 * @author Georg Fischer
 */
public class A094141 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A094141() {
    super(0, REALS.pow(CR.E.divide(CR.PI), CR.ONE.divide(CR.TEN)));
  }
}
