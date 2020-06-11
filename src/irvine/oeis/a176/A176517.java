package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.NINE.add(CR.THREE.multiply(CR.TEN.sqrt())).divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A176517 Decimal expansion of <code>(9+3*sqrt(10))/2</code>.
 * @author Georg Fischer
 */
public class A176517 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.add(CR.THREE.multiply(CR.TEN.sqrt())).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
