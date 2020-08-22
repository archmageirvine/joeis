package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020825 Decimal expansion of 1/sqrt(68).
 * @author Sean A. Irvine
 */
public class A020825 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(68).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
