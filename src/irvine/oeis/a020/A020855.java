package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020855 Decimal expansion of 1/sqrt(98).
 * @author Sean A. Irvine
 */
public class A020855 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(98).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
