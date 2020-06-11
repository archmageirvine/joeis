package irvine.oeis.a102;
// Generated by gen_seq4.pl dex CR.ONE.subtract(CR.NINE.multiply(CR.THREE.sqrt()).divide(CR.EIGHT.multiply(CR.PI))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A102520 Decimal expansion of <code>1-(9*sqrt(3))/(8*Pi)</code>.
 * @author Georg Fischer
 */
public class A102520 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.subtract(CR.NINE.multiply(CR.THREE.sqrt()).divide(CR.EIGHT.multiply(CR.PI)));

  @Override
  protected CR getCR() {
    return N;
  }
}
