package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016581 Decimal expansion of <code>log(9/2)</code>.
 * @author Sean A. Irvine
 */
public class A016581 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(new Q(9, 2)).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
