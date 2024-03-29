package irvine.oeis.a096;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A096413 Decimal expansion of (Pi*e)^(-1/4).
 * @author Georg Fischer
 */
public class A096413 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A096413() {
    super(0, REALS.pow(CR.PI.multiply(CR.E), CR.ONE.divide(CR.FOUR).negate()));
  }
}
