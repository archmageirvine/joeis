package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A005486 Decimal expansion of cube root of 6.
 * @author Sean A. Irvine
 */
public class A005486 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(6), CR.THREE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
