package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016593.
 * @author Sean A. Irvine
 */
public class A016593 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(new Q(33, 2)).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
