package irvine.oeis.a165;
// Generated by gen_seq4.pl dex CR.TEN.add(CR.TWO.multiply(CR.FIVE.sqrt())).sqrt().divide(CR.TAU) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A165954 Decimal expansion of <code>sqrt(10 + 2*sqrt(5))/(2*Pi)</code>.
 * @author Georg Fischer
 */
public class A165954 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.add(CR.TWO.multiply(CR.FIVE.sqrt())).sqrt().divide(CR.TAU);

  @Override
  protected CR getCR() {
    return N;
  }
}
