package irvine.oeis.a157;
// Generated by gen_seq4.pl dex CR.valueOf(33).add(CR.EIGHT.multiply(CR.SQRT2)).divide(CR.valueOf(31)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A157647 Decimal expansion of <code>(33+8*sqrt(2))/31</code>.
 * @author Georg Fischer
 */
public class A157647 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(33).add(CR.EIGHT.multiply(CR.SQRT2)).divide(CR.valueOf(31));

  @Override
  protected CR getCR() {
    return N;
  }
}
