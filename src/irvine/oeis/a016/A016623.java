package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016623.
 * @author Sean A. Irvine
 */
public class A016623 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(new Q(93, 2)).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
