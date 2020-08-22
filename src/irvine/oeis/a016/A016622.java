package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016622 Decimal expansion of log(91/2).
 * @author Sean A. Irvine
 */
public class A016622 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(new Q(91, 2)).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
