package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019601 Decimal expansion of <code>2*Pi*e/9</code>.
 * @author Sean A. Irvine
 */
public class A019601 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).divide(CR.NINE);

  @Override
  protected CR getCR() {
    return mN;
  }
}
