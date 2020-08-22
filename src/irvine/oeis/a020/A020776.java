package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020776 Decimal expansion of 1/sqrt(19).
 * @author Sean A. Irvine
 */
public class A020776 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(19).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
