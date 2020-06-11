package irvine.oeis.a113;
// Generated by gen_seq4.pl dex CR.TEN.divide(CR.valueOf(44955)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A113694 Decimal expansion of 10/44955.
 * @author Georg Fischer
 */
public class A113694 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.divide(CR.valueOf(44955));

  @Override
  protected CR getCR() {
    return N;
  }
}
