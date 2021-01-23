package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020827 Decimal expansion of 1/sqrt(70).
 * @author Sean A. Irvine
 */
public class A020827 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(70).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
