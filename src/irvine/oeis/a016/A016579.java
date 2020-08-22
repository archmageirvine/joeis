package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016579 Decimal expansion of log(5/2).
 * @author Sean A. Irvine
 */
public class A016579 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(new Q(5, 2)).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
