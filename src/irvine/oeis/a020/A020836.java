package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020836 Decimal expansion of 1/sqrt(79).
 * @author Sean A. Irvine
 */
public class A020836 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(79).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
