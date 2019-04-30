package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020844 Decimal expansion of <code>1/sqrt(87)</code>.
 * @author Sean A. Irvine
 */
public class A020844 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(87).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
