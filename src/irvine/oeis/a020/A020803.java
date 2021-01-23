package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020803 Decimal expansion of 1/sqrt(46).
 * @author Sean A. Irvine
 */
public class A020803 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(46).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
