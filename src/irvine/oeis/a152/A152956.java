package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152956.
 * @author Sean A. Irvine
 */
public class A152956 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(8).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
