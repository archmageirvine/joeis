package irvine.oeis.a018;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A018938.
 * @author Sean A. Irvine
 */
public class A018938 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.exp().subtract(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
