package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A179452.
 * @author Sean A. Irvine
 */
public class A179452 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.add(CR.valueOf(20).sqrt()).sqrt().divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
