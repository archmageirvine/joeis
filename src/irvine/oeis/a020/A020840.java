package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020840 Decimal expansion of <code>1/sqrt(83)</code>.
 * @author Sean A. Irvine
 */
public class A020840 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(83).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
