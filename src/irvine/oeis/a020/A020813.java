package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020813 Decimal expansion of 1/sqrt(56).
 * @author Sean A. Irvine
 */
public class A020813 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(56).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
