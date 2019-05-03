package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019315 Decimal expansion of <code>e^Pi + Pi +</code> e.
 * @author Sean A. Irvine
 */
public class A019315 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.exp().add(CR.PI).add(CR.E);

  @Override
  protected CR getCR() {
    return N;
  }
}
