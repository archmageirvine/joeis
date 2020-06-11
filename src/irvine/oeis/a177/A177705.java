package irvine.oeis.a177;
// Generated by gen_seq4.pl dex CR.THREE.add(CR.TWO.multiply(CR.SIX.sqrt())).divide(CR.FIVE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A177705 Decimal expansion of <code>(3+2*sqrt(6))/5</code>.
 * @author Georg Fischer
 */
public class A177705 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.add(CR.TWO.multiply(CR.SIX.sqrt())).divide(CR.FIVE);

  @Override
  protected CR getCR() {
    return N;
  }
}
