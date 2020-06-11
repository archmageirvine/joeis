package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.valueOf(21).add(CR.valueOf(483).sqrt()).divide(CR.SIX) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A176438 Decimal expansion of <code>(21+sqrt(483))/6</code>.
 * @author Georg Fischer
 */
public class A176438 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(21).add(CR.valueOf(483).sqrt()).divide(CR.SIX);

  @Override
  protected CR getCR() {
    return N;
  }
}
