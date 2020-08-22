package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020829 Decimal expansion of 1/sqrt(72) = 1/(3*2^(3/2)) = sqrt(2)/12.
 * @author Sean A. Irvine
 */
public class A020829 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(72).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
