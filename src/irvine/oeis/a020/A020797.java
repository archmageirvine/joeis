package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020797 Decimal expansion of <code>1/sqrt(40)</code>.
 * @author Sean A. Irvine
 */
public class A020797 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(40).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
