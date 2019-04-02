package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016591 Decimal expansion of log(29/2).
 * @author Sean A. Irvine
 */
public class A016591 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(new Q(29, 2)).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
