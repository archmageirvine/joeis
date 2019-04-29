package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020772 Decimal expansion of <code>1/sqrt(15)</code>.
 * @author Sean A. Irvine
 */
public class A020772 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(15).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
