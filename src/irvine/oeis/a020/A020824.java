package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020824 Decimal expansion of 1/sqrt(67).
 * @author Sean A. Irvine
 */
public class A020824 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(67).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
