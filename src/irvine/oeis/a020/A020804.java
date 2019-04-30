package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020804 Decimal expansion of <code>1/sqrt(47)</code>.
 * @author Sean A. Irvine
 */
public class A020804 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(47).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
