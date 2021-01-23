package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020788 Decimal expansion of 1/sqrt(31).
 * @author Sean A. Irvine
 */
public class A020788 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(31).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
