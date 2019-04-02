package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019809.
 * @author Sean A. Irvine
 */
public class A019809 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.TWO).sqrt().divide(CR.valueOf(23));

  @Override
  protected CR getCR() {
    return N;
  }
}
