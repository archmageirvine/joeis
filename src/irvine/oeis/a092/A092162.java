package irvine.oeis.a092;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A092162 Decimal expansion of (e/Pi)^6.
 * @author Georg Fischer
 */
public class A092162 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A092162() {
    super(0, REALS.pow(CR.E.divide(CR.PI), CR.SIX));
  }
}
