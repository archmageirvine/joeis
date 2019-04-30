package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016604 Decimal expansion of <code>log(55/2)</code>.
 * @author Sean A. Irvine
 */
public class A016604 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(new Q(55, 2)).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
