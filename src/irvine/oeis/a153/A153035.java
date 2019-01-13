package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153035.
 * @author Sean A. Irvine
 */
public class A153035 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(20).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
