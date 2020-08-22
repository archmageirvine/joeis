package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020856 Decimal expansion of 1/sqrt(99).
 * @author Sean A. Irvine
 */
public class A020856 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(99).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
