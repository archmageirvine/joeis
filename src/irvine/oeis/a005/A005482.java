package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A005482 Decimal expansion of cube root of 7.
 * @author Sean A. Irvine
 */
public class A005482 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(7), CR.THREE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
