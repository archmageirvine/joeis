package irvine.oeis.a161;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A161015.
 * @author Sean A. Irvine
 */
public class A161015 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.tan(CR.valueOf(new Q(1, 6)));

  @Override
  protected CR getCR() {
    return N;
  }
}
