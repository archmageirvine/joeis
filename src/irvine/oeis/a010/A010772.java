package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010772 Decimal expansion of 10th root of 2.
 * @author Sean A. Irvine
 */
public class A010772 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.TWO, CR.valueOf(new Q(1, 10)));

  @Override
  protected CR getCR() {
    return N;
  }
}
