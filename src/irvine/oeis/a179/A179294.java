package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A179294.
 * @author Sean A. Irvine
 */
public class A179294 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(42).add(CR.valueOf(1620).sqrt()).sqrt().divide(CR.valueOf(12));

  @Override
  protected CR getCR() {
    return N;
  }
}
