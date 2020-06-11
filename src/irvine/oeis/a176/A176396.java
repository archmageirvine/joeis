package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.SIX.add(CR.valueOf(42).sqrt()).divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A176396 Decimal expansion of <code>(6+sqrt(42))/2</code>.
 * @author Georg Fischer
 */
public class A176396 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.add(CR.valueOf(42).sqrt()).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
