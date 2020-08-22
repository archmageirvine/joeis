package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020798 Decimal expansion of 1/sqrt(41).
 * @author Sean A. Irvine
 */
public class A020798 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(41).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
