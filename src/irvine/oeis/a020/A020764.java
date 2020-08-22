package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020764 Decimal expansion of 1/sqrt(7).
 * @author Sean A. Irvine
 */
public class A020764 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
