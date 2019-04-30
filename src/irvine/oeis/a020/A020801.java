package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020801 Decimal expansion of <code>1/sqrt(44)</code>.
 * @author Sean A. Irvine
 */
public class A020801 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(44).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
