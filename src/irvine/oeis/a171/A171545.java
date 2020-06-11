package irvine.oeis.a171;
// Generated by gen_seq4.pl dex CR.TWO.divide(CR.SEVEN).sqrt() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A171545 Decimal expansion of <code>sqrt(2/7)</code>.
 * @author Georg Fischer
 */
public class A171545 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.divide(CR.SEVEN).sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
