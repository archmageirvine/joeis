package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010767.
 * @author Sean A. Irvine
 */
public class A010767 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.TWO, CR.valueOf(Q.ONE_QUARTER));

  @Override
  protected CR getCR() {
    return N;
  }
}
