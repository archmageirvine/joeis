package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.math.cr.EulerGamma;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020759.
 * @author Sean A. Irvine
 */
public class A020759 extends DecimalExpansionSequence {

  private static final CR N = EulerGamma.SINGLETON.add(CR.TWO.log().multiply(CR.TWO));

  @Override
  protected CR getCR() {
    return N;
  }
}
