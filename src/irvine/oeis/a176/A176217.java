package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.valueOf(14).add(CR.FOUR.multiply(CR.valueOf(14).sqrt())).divide(CR.SEVEN) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A176217 Decimal expansion of <code>(14+4*sqrt(14))/7</code>.
 * @author Georg Fischer
 */
public class A176217 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).add(CR.FOUR.multiply(CR.valueOf(14).sqrt())).divide(CR.SEVEN);

  @Override
  protected CR getCR() {
    return N;
  }
}
