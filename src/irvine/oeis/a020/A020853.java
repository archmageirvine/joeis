package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020853 Decimal expansion of 1/sqrt(96).
 * @author Sean A. Irvine
 */
public class A020853 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(96).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
