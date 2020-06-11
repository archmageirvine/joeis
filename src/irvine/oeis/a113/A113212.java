package irvine.oeis.a113;
// Generated by gen_seq4.pl dex CR.SIX.log().divide(CR.ONE.add(CR.PHI).log()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A113212 Decimal expansion of <code>log(6)/log(1 +</code> phi).
 * @author Georg Fischer
 */
public class A113212 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.log().divide(CR.ONE.add(CR.PHI).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
