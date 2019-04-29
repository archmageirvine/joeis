package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020763 Decimal expansion of <code>1/sqrt(6)</code>.
 * @author Sean A. Irvine
 */
public class A020763 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
