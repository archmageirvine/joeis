package irvine.oeis.a194;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A194656 Decimal expansion of (2*Pi^5*log(2) - 30*Pi^3*zeta(3) + 225*Pi*zeta(5))/320.
 * @author Georg Fischer
 */
public class A194656 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A194656() {
    super(0, CR.TWO.multiply(REALS.pow(CR.PI, CR.FIVE)).multiply(CR.TWO.log()).subtract(CR.valueOf(30).multiply(REALS.pow(CR.PI, CR.THREE)).multiply(Zeta.zeta(3))).add(CR.valueOf(225).multiply(CR.PI).multiply(Zeta.zeta(5))).divide(CR.valueOf(320)));
  }
}
