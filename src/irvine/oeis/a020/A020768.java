package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020768 Decimal expansion of 1/sqrt(11).
 * @author Sean A. Irvine
 */
public class A020768 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(11).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
