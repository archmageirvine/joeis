package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020817 Decimal expansion of <code>1/sqrt(60)</code>.
 * @author Sean A. Irvine
 */
public class A020817 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(60).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
