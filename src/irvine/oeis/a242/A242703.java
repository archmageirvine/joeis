package irvine.oeis.a242;
// Generated by gen_seq4.pl dex CR.SEVEN.sqrt().divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A242703 Decimal expansion of <code>sqrt(7)/2</code>.
 * @author Georg Fischer
 */
public class A242703 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.sqrt().divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
