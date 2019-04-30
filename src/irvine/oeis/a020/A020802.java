package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020802 Decimal expansion of <code>1/sqrt(45)</code>.
 * @author Sean A. Irvine
 */
public class A020802 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(45).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
