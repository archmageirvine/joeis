package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016589.
 * @author Sean A. Irvine
 */
public class A016589 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(new Q(25, 2)).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
