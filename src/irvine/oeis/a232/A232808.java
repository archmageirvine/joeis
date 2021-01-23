package irvine.oeis.a232;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A232808 Decimal expansion of the surface area of a 3D sphere with unit volume.
 * @author Sean A. Irvine
 */
public class A232808 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.PI.multiply(36), CR.THREE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
