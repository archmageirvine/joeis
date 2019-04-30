package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016600 Decimal expansion of <code>log(47/2)</code>.
 * @author Sean A. Irvine
 */
public class A016600 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(new Q(47, 2)).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
