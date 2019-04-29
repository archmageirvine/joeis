package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020780 Decimal expansion of <code>1/sqrt(23)</code>.
 * @author Sean A. Irvine
 */
public class A020780 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(23).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
