package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016597 Decimal expansion of <code>log(41/2)</code>.
 * @author Sean A. Irvine
 */
public class A016597 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(new Q(41, 2)).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
