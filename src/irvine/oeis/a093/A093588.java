package irvine.oeis.a093;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A093588 Decimal expansion of -1/8 + 4/Pi^2.
 * @author Georg Fischer
 */
public class A093588 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A093588() {
    super(0, CR.ONE.divide(CR.EIGHT).negate().add(CR.FOUR.divide(REALS.pow(CR.PI, CR.TWO))));
  }
}
