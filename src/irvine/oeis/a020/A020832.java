package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020832 Decimal expansion of 1/sqrt(75).
 * @author Sean A. Irvine
 */
public class A020832 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(75).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
