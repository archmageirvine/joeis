package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010768.
 * @author Sean A. Irvine
 */
public class A010768 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.TWO, CR.valueOf(new Q(1, 6)));

  @Override
  protected CR getCR() {
    return N;
  }
}
