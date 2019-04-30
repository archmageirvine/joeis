package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020809 Decimal expansion of <code>1/sqrt(52)</code>.
 * @author Sean A. Irvine
 */
public class A020809 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(52).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
