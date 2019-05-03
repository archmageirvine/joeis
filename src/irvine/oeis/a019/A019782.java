package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019782 Decimal expansion of <code>sqrt(e)/9</code>.
 * @author Sean A. Irvine
 */
public class A019782 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.valueOf(9));

  @Override
  protected CR getCR() {
    return N;
  }
}
