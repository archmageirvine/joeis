package irvine.oeis.a188;
// Generated by gen_seq4.pl dex CR.SEVEN.add(CR.valueOf(85).sqrt()).divide(CR.SIX) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A188737 Decimal expansion of <code>(7+sqrt(85))/6</code>.
 * @author Georg Fischer
 */
public class A188737 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.add(CR.valueOf(85).sqrt()).divide(CR.SIX);

  @Override
  protected CR getCR() {
    return N;
  }
}
