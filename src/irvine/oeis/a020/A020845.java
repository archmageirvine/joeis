package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020845 Decimal expansion of 1/sqrt(88).
 * @author Sean A. Irvine
 */
public class A020845 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(88).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
