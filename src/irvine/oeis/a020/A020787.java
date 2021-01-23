package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020787 Decimal expansion of 1/sqrt(30).
 * @author Sean A. Irvine
 */
public class A020787 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(30).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
