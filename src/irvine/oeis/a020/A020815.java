package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020815 Decimal expansion of 1/sqrt(58).
 * @author Sean A. Irvine
 */
public class A020815 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(58).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
