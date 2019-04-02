package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019805.
 * @author Sean A. Irvine
 */
public class A019805 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.TWO).sqrt().divide(CR.valueOf(15));

  @Override
  protected CR getCR() {
    return N;
  }
}
