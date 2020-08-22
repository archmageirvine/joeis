package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020833 Decimal expansion of 1/sqrt(76).
 * @author Sean A. Irvine
 */
public class A020833 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(76).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
