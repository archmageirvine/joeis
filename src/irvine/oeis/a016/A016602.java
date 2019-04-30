package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016602 Decimal expansion of <code>log(51/2)</code>.
 * @author Sean A. Irvine
 */
public class A016602 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(new Q(51, 2)).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
