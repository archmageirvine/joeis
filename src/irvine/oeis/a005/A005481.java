package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A005481 Decimal expansion of cube root of 5.
 * @author Sean A. Irvine
 */
public class A005481 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.FIVE, CR.THREE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
