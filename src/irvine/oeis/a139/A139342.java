package irvine.oeis.a139;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A139342 Decimal expansion of e^(-(1+sqrt(5))/2).
 * @author Georg Fischer
 */
public class A139342 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A139342() {
    super(0, REALS.pow(CR.E, CR.ZERO.subtract(CR.ONE.add(CR.FIVE.sqrt()).divide(CR.TWO))));
  }
}
