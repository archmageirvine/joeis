package irvine.oeis.a156;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A156035.
 * @author Sean A. Irvine
 */
public class A156035 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.add(CR.valueOf(8).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
