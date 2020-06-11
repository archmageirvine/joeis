package irvine.oeis.a188;
// Generated by gen_seq4.pl dex CR.FOUR.add(CR.SEVEN.sqrt()).divide(CR.THREE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A188945 Decimal expansion of <code>(4+sqrt(7))/3</code>.
 * @author Georg Fischer
 */
public class A188945 extends DecimalExpansionSequence {

  private static final CR N = CR.FOUR.add(CR.SEVEN.sqrt()).divide(CR.THREE);

  @Override
  protected CR getCR() {
    return N;
  }
}
