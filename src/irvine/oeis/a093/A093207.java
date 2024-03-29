package irvine.oeis.a093;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A093207 Decimal expansion of Pi^(-1/6).
 * @author Georg Fischer
 */
public class A093207 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A093207() {
    super(0, REALS.pow(CR.PI, CR.ONE.divide(CR.SIX).negate()));
  }
}
