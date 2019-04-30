package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016615 Decimal expansion of <code>log(77/2)</code>.
 * @author Sean A. Irvine
 */
public class A016615 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(new Q(77, 2)).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
