package irvine.oeis.a107;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A107370 Decimal expansion of 8*Pi^4/(21*zeta(3)).
 * @author Georg Fischer
 */
public class A107370 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A107370() {
    super(2, CR.EIGHT.multiply(REALS.pow(CR.PI, CR.FOUR)).divide(CR.valueOf(21).multiply(Zeta.zeta(3))));
  }
}
