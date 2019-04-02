package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A179553 Decimal expansion of the surface area of pentagonal pyramid with edge length 1.
 * @author Sean A. Irvine
 */
public class A179553 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(10).add(CR.FIVE.sqrt()).add(CR.valueOf(75).add(CR.valueOf(4500).sqrt()).sqrt()).multiply(CR.FIVE).divide(CR.TWO).sqrt().divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
