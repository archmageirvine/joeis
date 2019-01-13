package irvine.oeis.a089;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A089491.
 * @author Sean A. Irvine
 */
public class A089491 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
