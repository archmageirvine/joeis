package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002581 Decimal expansion of cube root of 3.
 * @author Sean A. Irvine
 */
public class A002581 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.THREE, CR.THREE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
