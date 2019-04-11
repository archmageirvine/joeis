package irvine.oeis.a229;

import irvine.math.cr.CR;
import irvine.math.cr.EulerGamma;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A229837 Decimal expansion of Sum_{n&gt;=1} <code>1/(n*n!)</code>.
 * @author Sean A. Irvine
 */
public class A229837 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.ei().subtract(EulerGamma.SINGLETON);

  @Override
  protected CR getCR() {
    return N;
  }
}
