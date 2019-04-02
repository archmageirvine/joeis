package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A005480 Decimal expansion of cube root of 4.
 * @author Sean A. Irvine
 */
public class A005480 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.FOUR, CR.THREE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
