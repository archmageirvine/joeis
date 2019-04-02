package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002580 Decimal expansion of cube root of 2.
 * @author Sean A. Irvine
 */
public class A002580 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.TWO, CR.THREE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
