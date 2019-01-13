package irvine.oeis.a091;

import irvine.math.cr.CR;
import irvine.math.cr.EulerGamma;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A091724.
 * @author Sean A. Irvine
 */
public class A091724 extends DecimalExpansionSequence {

  private static final CR N = EulerGamma.SINGLETON.multiply(CR.TWO).exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
