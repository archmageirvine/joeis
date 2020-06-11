package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020765 Decimal expansion of <code>1/sqrt(8)</code>.
 * @author Sean A. Irvine
 */
public class A020765 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
