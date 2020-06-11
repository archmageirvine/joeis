package irvine.oeis.a189;
// Generated by gen_seq4.pl dex CR.NINE.add(CR.valueOf(17).sqrt()).divide(CR.EIGHT) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A189038 Decimal expansion of <code>(9+sqrt(17))/8</code>.
 * @author Georg Fischer
 */
public class A189038 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.add(CR.valueOf(17).sqrt()).divide(CR.EIGHT);

  @Override
  protected CR getCR() {
    return N;
  }
}
