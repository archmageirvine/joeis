package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A059742 Decimal expansion of e <code>+ Pi</code>.
 * @author Sean A. Irvine
 */
public class A059742 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.add(CR.E);

  @Override
  protected CR getCR() {
    return N;
  }
}
