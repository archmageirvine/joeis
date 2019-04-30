package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020841 Decimal expansion of <code>1/sqrt(84)</code>.
 * @author Sean A. Irvine
 */
public class A020841 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(84).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
