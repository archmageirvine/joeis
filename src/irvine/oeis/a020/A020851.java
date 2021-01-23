package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020851 Decimal expansion of 1/sqrt(94).
 * @author Sean A. Irvine
 */
public class A020851 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(94).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
