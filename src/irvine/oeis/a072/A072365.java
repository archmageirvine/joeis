package irvine.oeis.a072;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A072365 Decimal expansion of (1/3)^(1/3).
 * @author Georg Fischer
 */
public class A072365 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A072365() {
    super(0, REALS.pow(CR.ONE_THIRD, CR.ONE.divide(CR.THREE)));
  }
}
