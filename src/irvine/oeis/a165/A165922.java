package irvine.oeis.a165;
// Generated by gen_seq4.pl dex CR.TWO.multiply(CR.THREE.sqrt()).divide(CR.NINE.multiply(CR.PI)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A165922 Decimal expansion of <code>2*sqrt(3)/(9*Pi)</code>.
 * @author Georg Fischer
 */
public class A165922 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.multiply(CR.THREE.sqrt()).divide(CR.NINE.multiply(CR.PI));

  @Override
  protected CR getCR() {
    return N;
  }
}
