package irvine.oeis.a229;

import irvine.math.cr.CR;
import irvine.math.cr.EulerGamma;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A229837.
 * @author Sean A. Irvine
 */
public class A229837 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.ei().subtract(EulerGamma.SINGLETON);

  @Override
  protected CR getCR() {
    return N;
  }
}
