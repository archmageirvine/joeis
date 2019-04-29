package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020774 Decimal expansion of <code>1/sqrt(17)</code>.
 * @author Sean A. Irvine
 */
public class A020774 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
